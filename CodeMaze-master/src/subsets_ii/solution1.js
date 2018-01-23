/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsetsWithDup = function(nums) {
    var results = [];
    nums.sort();
    subsetsWithDupHelper(results, [], nums, 0);
    
    return results;
};

var subsetsWithDupHelper = function(results, list, nums, startIndex) {
    var newList = list.concat();
    results.push(newList);
    
    for (var i = startIndex; i < nums.length; ++i) {
        if (i !== 0 && i != startIndex && nums[i] == nums[i - 1]) continue;
        newList.push(nums[i]);
        subsetsWithDupHelper(results, newList, nums, i + 1);
        newList.pop();
    }
};