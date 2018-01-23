class Solution {
public:
    int search(int A[], int n, int target) {
        for (size_t i = 0; i != n; ++i) {
            if (target == A[i]) {
                return i;
            }
        }
        return -1;
    }
};