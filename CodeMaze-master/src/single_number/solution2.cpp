// Given an array of integers, every element appears twice except for one. Find that single one.

// Note:
// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

// bitwise XOR solution
class Solution {
public:
    int singleNumber(int A[], int n) {
        int x = A[0];
        for (size_t i=1; i != n; ++i) {
            x ^= A[i];
        }
        return x;
    }
};
