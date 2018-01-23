/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
    var results = [];
    subsetsHelper(results, [], nums, 0);
    
    return results;
};

var subsetsHelper = function(results, list, nums, startIndex) {
    var newList = list.concat(); // deep copy
    results.push(newList);
    
    for (var i = startIndex; i < nums.length; ++i) {
        newList.push(nums[i]);
        subsetsHelper(results, newList, nums, i + 1);
        newList.pop();
    }
}