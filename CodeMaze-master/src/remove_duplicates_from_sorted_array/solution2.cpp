class Solution {
public:
    int removeDuplicates(int A[], int n) {
        return distance(A, unique(A, A+n));
    }
};