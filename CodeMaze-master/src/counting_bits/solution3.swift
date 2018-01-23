class Solution {
	// time complexity: O(n), space complexity: O(n)
    func countBits(_ num: Int) -> [Int] {
        var res = [Int](repeating: 0, count: num+1)
        
        if num > 0 {
        
            for i in 1 ... num {
                res[i] = res[i&(i-1)] + 1
            }
        }
        
        return res
    }
}