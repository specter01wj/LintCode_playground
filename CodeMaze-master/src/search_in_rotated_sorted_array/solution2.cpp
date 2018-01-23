class Solution {
public:
    int search(int A[], int n, int target) {
        size_t first = 0;
        size_t last = n;
        while (first != last) {
            size_t middle = first + (last - first) / 2;
            if (A[middle] == target) {
                return middle;
            } else if (A[first] <= A[middle]) {
                if (target < A[middle] && target >= A[first]) {
                    last = middle;
                } else {
                    first = middle + 1;
                }
            } else {
                if (target <= A[last-1] && target > A[middle]){
                    first = middle + 1;
                } else {
                    last = middle;
                }
            }
        }
        return -1;
    }
};