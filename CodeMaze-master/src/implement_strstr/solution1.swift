class Solution {
    func strStr(_ haystack: String, _ needle: String) -> Int {
        let haystack_len = haystack.characters.count
        let needle_len = needle.characters.count
        let haystack_chars = Array(haystack.characters)
        let needle_chars = Array(needle.characters)
        
        guard haystack_len >= needle_len else {
            return -1
        }
        
        guard needle_len != 0 else {
            return 0
        }
        
        for i in 0 ... haystack_len - needle_len {
            // use str.index(str.startIndex, offsetBy: i) may cause time limit issue when string is too long
            if haystack_chars[i] == needle_chars[0] {
                for j in 0 ..< needle_len {
                    if haystack_chars[i + j] != needle_chars[j] {
                        break
                    }
                    if j + 1 == needle_len {
                        return i
                    }
                }
            }
        }
        
        return -1
    }
}