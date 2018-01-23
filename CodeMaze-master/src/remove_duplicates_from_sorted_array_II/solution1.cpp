class Solution {
public:
    int removeDuplicates(int A[], int n) {
        if (n == 0) return 0;
        size_t index = 0;
        int flag = 0;
        for (size_t i = 1; i != n; ++i) {
            if (A[index] == A[i] && flag != 1) {
                A[++index] = A[i];
                ++flag; // can extend to check duplicates are 3, 4, 5...
            } else if (A[index] != A[i]) {
                A[++index] = A[i];
                flag = 0;
            }
        }
        
        return index + 1;
    }
};