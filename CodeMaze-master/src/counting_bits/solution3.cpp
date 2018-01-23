class Solution {
public:
	// time complexity: O(n), space complexity: O(n)
    vector<int> countBits(int num) {
        vector<int> results = vector<int>(num+1, 0);
        if (num > 0) {
            for (int i = 1; i <= num; ++i) {
                results[i] = results[i & (i-1)] + 1;
            }
        }
        return results;
    }
};