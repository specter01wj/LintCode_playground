class Solution {
    func permute(_ nums: [Int]) -> [[Int]] {
        var res = [[Int]]()
        var path = nums
        
        permuteHelper(&res, path, 0)
        
        return res
    }
    
    private func permuteHelper(_ res: inout [[Int]], _ path: [Int], _ startIndex: Int) {
        if startIndex >= path.count {
            res.append(path)
        }
        
        var path = path
        
        for i in startIndex ..< path.count {
            
            if i != startIndex {
                // Precondition: a and b do not alias each other.
                swap(&path[startIndex], &path[i])
            }
            permuteHelper(&res, path, startIndex + 1)
            // if i != startIndex {
            //     swap(&path[startIndex], &path[i])
            // }
        }
    }
}