class Solution {
public:
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    bool canJump(vector<int> A) {
        // write you code here
        vector<bool> x(A.size(), false);
        x[0] = true;
        for (int i = 0; i != A.size(); ++i) {
            if (x[i] && A[i] > 0) {
                for (int j = 1; j <= A[i]; ++j) {
                    if (i+j < A.size()) x[i+j] = true;
                    else break;
                }
            }
        }
        return x[A.size()-1];
    }
};
