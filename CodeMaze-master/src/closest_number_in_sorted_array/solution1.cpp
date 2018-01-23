class Solution {
public:
    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    int closestNumber(vector<int>& A, int target) {
        // Write your code here
        if (A.empty()) return -1;
        if (A.size() == 1) return 0;
        
        int start = 0;
        int end = A.size() - 1;
        int mid;
        
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) return mid;
            else if (A[mid] > target) end = mid;
            else start = mid;
        }
        if (abs(target - A[start]) < abs(A[end] - target)) return start;
        else return end;
    }
};