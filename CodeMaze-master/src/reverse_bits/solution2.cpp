class Solution {
public:
    // time complexity: O(n/L), for n-bit integers and L-bit cache keys
    uint32_t reverseBits(uint32_t n) {
        const int kMaskSize = 8;
        const int kBitMask = 0xFF;
        
        return precomputed_reverse(n & kBitMask) << (3 * kMaskSize) |
            precomputed_reverse(n >> kMaskSize & kBitMask) << (2 * kMaskSize) |
            precomputed_reverse(n >> (2 * kMaskSize) & kBitMask) << kMaskSize |
            precomputed_reverse(n >> (3 * kMaskSize) & kBitMask);
    }
private:
    uint32_t precomputed_reverse(uint32_t n) {
        for (int i = 0; i != 4; ++i) {
            if ((n >> i & 1) != (n >> (8 - i - 1) & 1)) {
                uint32_t bits_map = 1 << i | 1 << (8 - i - 1);
                n ^= bits_map;
            }
        }
        
        return n;
    }
};