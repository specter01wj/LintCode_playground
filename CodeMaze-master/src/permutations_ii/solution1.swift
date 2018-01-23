class Solution {
    func permuteUnique(_ nums: [Int]) -> [[Int]] {
        let nums = nums.sorted(by: <)
        var results = [[Int]]()
        permuteUniqueHelper(&results, nums, 0)
        
        return results
    }
    private func permuteUniqueHelper(_ results: inout [[Int]], _ nums: [Int], _ startIndex: Int) {
        if startIndex == nums.count {
            results.append(nums)
        }
        
        var nums = nums
        
        for i in startIndex ..< nums.count {
            if i != 0 && i != startIndex && nums[i] == nums[startIndex] {
                continue
            }
            
            if i != startIndex {
                swap(&nums[i], &nums[startIndex])
            }
            permuteUniqueHelper(&results, nums, startIndex + 1)
        }
    }
}