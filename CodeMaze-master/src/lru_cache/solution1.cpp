#include <iostream>
#include <vector>
#include <map>
#include <string>
#include <algorithm>
#include <set>
#include <cassert>
using namespace std;

struct Node{
    Node* next;
    Node* prev;
    int value;
    int key;
    Node(Node* p, Node* n, int k, int val):prev(p),next(n),key(k),value(val){};
    Node(int k, int val):prev(NULL),next(NULL),key(k),value(val){};
};

class Cache{
protected: 
    map<int,Node*> mp; //map the key to the node in the linked list
    int cp;  //capacity
    Node* tail; // double linked list tail pointer
    Node* head; // double linked list head pointer
    virtual void set(int, int) = 0; //set function
    virtual int get(int) = 0; //get function

};

class LRUCache : public Cache {
public:
    void set(int key, int value) {
        if (mp.find(key) != mp.end()) {
            Node *node = mp[key];
            node->value = value;
            insert_to_head(node, "FOUND");
        } else {
            Node *node = new Node(key, value);
            insert_to_head(node, "NOT FOUND");
        }
        //insert_to_head(node);
    }
        
    int get(int key) {
        if (mp.find(key) != mp.end()) {
            Node *node = mp[key];
            insert_to_head(node, "FOUND");
            return node->value;
        } else {
            return -1;
        }
    }
        
    LRUCache(int c) : Cache() {
        cp = c;
    }
private:
    void insert_to_head(Node *node, string status) {
        if (mp.empty()) {
            head = node;
            tail = node;
            mp[node->key] = node;
        } else if (status == "FOUND") {
            if (node->prev != NULL) {
                node->prev->next = node->next;
                head->prev = node;
                node->next = head;
                head = node;
            } 
        } else if (status == "NOT FOUND") {
            if (mp.size() == cp) {
                mp.erase(tail->key);
                head->prev = node;
                node->next = head;
                head = node;
                
                if (tail->prev != NULL) {
                    tail->prev->next = NULL;
                    tail = tail->prev;
                }
            } else {
                head->prev = node;
                node->next = head;
                head = node;
            }
            mp[node->key] = node;
        }
    }
};

int main() {
   int n, capacity,i;
   cin >> n >> capacity;
   LRUCache l(capacity);
   for(i=0;i<n;i++) {
      string command;
      cin >> command;
      if(command == "get") {
         int key;
         cin >> key;
         cout << l.get(key) << endl;
      } 
      else if(command == "set") {
         int key, value;
         cin >> key >> value;
         l.set(key,value);
      }
   }
   return 0;
}

