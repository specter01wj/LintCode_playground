/*
Given a list of strings words representing an English Dictionary, find the longest word in words that can be built one character at a time by other words in words. If there is more than one possible answer, return the longest word with the smallest lexicographical order.

If there is no answer, return the empty string.

Example
Example 1:

Input: 
words = ["w","wo","wor","worl", "world"]
Output: "world"
Explanation: 
The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
Example 2:

Input: 
words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
Output: "apple"
Explanation: 
Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
*/

import java.util.*;

public class E_1071_Longest_Word_in_Dictionary {

    public static void main(String[] args) {

        String[] input = {"w","wo","wor","worl", "world"};
        String output = longestWord(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + (output));

    }

    /**
     * @param words: a list of strings
     * @return: the longest word in words that can be built one character at a time by other words in words
     */
    public static String longestWord(String[] words) {
        // Write your code here
        Trie trie = new Trie(words);
        int index = 0;
        for (String word: words) {
            trie.insert(word, ++index); //indexed by 1
        }
        return trie.dfs();
    }

}

class Node {
    char c;
    HashMap<Character, Node> children = new HashMap();
    int end;  // end非零表示这是一个终结节点，且end-1对应的就是该word在words中的索引
    public Node(char c){
        this.c = c;
    }
}

class Trie {
    Node root;
    String[] words;
    public Trie(String[] words) {
        root = new Node('0');
        this.words = words;
    }

    public void insert(String word, int index) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            cur.children.putIfAbsent(c, new Node(c));
            cur = cur.children.get(c);
        }
        cur.end = index;
    }

    public String dfs() {
        String ans = "";
        Stack<Node> stack = new Stack();
        stack.push(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            if (node.end > 0 || node == root) {
                if (node != root) {
                    String word = words[node.end - 1];
                    if (word.length() > ans.length() ||
                            word.length() == ans.length() && word.compareTo(ans) < 0) {
                        ans = word;
                    }
                }
                for (Node nei: node.children.values()) {
                    stack.push(nei);
                }
            }
        }
        return ans;
    }
}
