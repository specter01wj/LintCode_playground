class Solution {
public:
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    int strStr(const char *source, const char *target) {
        // write your code here
        // check if source or target is null
        if (source == NULL || target == NULL) return -1;
        
        int source_len = strlen(source);
        int target_len = strlen(target);
        
        // check if source or target is empty
        if (target_len == 0) return 0;
        
        if (source_len < target_len) return -1;
        
        for (int i = 0; i != source_len; ++i) {
            bool found = true;
            for (int j = 0; j != target_len; ++j) {
                if (source[i + j] == target[j]) {
                    continue;
                } else {
                    found = false;
                }
            }
            
            if (found) return i;
        }
        
        
        return -1;
    }
};