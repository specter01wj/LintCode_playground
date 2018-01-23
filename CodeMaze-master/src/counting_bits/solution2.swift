class Solution {
    func countBits(_ num: Int) -> [Int] {
        var results = [Int]()
        
        for i in 0 ... num {
            let count = countBitsHelper(i)
            results.append(count)
        }
        
        return results
    }
    
    private func countBitsHelper(_ i: Int) -> Int {
        var count = 0
        var num = i
        while num != 0 {
            count += num & 1
            num >>= 1
        }
        return count
    }
}