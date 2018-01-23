class Solution {
    func subsets(_ nums: [Int]) -> [[Int]] {
        var res = [[Int]]()
        var path = [Int]()
        
        subsets_helper(nums, &res, path, 0)
        
        return res
        
    }
    
    private func subsets_helper(_ nums: [Int], _ res: inout [[Int]], _ path: [Int], _ index: Int) {
        res.append(path)
        
        var list = path
        
        for i in index ..< nums.count {
            list.append(nums[i])
            subsets_helper(nums, &res, list, i + 1)
            list.removeLast()
        }
    }
}