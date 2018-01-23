class Solution {
public:
    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    int lastPosition(vector<int>& A, int target) {
        // Write your code here
        if (A.empty()) return -1;
        
        if (A.size() == 1) {
            if (A[0] == target) return 0;
            else return -1;
        }
        
        int start = 0;
        int end = A.size() - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > target) end = mid;
            else if (A[mid] <= target) start = mid;
        }
        
        if (A[end] == target) return end;
        if (A[start] == target) return start;
        
        return -1;
    }
};