class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        for (int i = 0; i != 16; ++i) {
            // n >> i & 1 will get value of ith
            if ((n >> i & 1) != (n >> (32 - i - 1) & 1)) {
                // the bits map is used for bit flip
                uint32_t bits_map = 1 << i | 1 << (32 - i - 1);
                n ^= bits_map;
            }
        }
        
        return n;
    }
};