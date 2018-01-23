class Solution {
    func subsetsWithDup(_ nums: [Int]) -> [[Int]] {
        var res = [[Int]]()
        var path = [Int]()
        
        let nums = nums.sorted(by: <)
        
        subsetsWithDupHelper(&res, path, nums, 0)
        
        return res
    }
    
    private func subsetsWithDupHelper(_ res: inout [[Int]], _ path: [Int], _ nums: [Int], _ startIndex: Int) {
        res.append(path)
        
        var list = path
        
        for i in startIndex ..< nums.count {
            if i != 0 && i != startIndex && nums[i] == nums[i-1] {
                continue
            }
            
            list.append(nums[i])
            subsetsWithDupHelper(&res, list, nums, i + 1)
            list.removeLast()
        }
    }
}