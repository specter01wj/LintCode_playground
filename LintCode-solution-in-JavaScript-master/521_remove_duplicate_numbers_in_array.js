'use strict';

const deduplication1= (nums) => {
    // Time: O(n), Space: O(n)
    let uniqueNums = new Set();
    let idx = 0;
    for (let num of nums) {
        if (! uniqueNums.has(num)) {
            uniqueNums.add(num);
            nums[idx++] = num;
        }
    }
    return idx;
};

const deduplication2 = (nums) => {
    // Time: O(nlogn), Space: O(1)
    nums.sort((num1,num2) => {return num1 > num2 ? 1 : -1});
    let idx = 0;
    let size = nums.length;
    for (let i = 0; i < size; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[idx++] = nums[i];
        }
    }
    return idx;
};



// const main = () => {
//     let nums;
//     nums = [1,3,1,4,4,2];
//     console.log(deduplication1(nums));
//     nums = [1,3,1,4,4,2];
//     console.log(deduplication2(nums));
//
// };
// main();
