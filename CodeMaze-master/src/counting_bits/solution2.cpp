class Solution {
public:
    vector<int> countBits(int num) {
        vector<int> results;
        
        for (int i = 0; i <= num; ++i) {
            results.push_back(countBitsHelper(i));
        }
        
        return results;
    }
private:
    int countBitsHelper(int i) {
        int res = 0;
        while (i) {
            res += i & 1;
            i >>= 1;
        }
        
        return res;
    }
};