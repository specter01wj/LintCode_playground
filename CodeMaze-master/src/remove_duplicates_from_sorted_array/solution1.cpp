class Solution {
public:
    int removeDuplicates(int A[], int n) {
        int removeNum = 0;
        if (n == 0) return 0;
        size_t index = 0;
        for (size_t i = 1; i != n; ++i) {
            if (A[index] != A[i]) A[++index] = A[i];
        }
        
        return index+1;
    }
};