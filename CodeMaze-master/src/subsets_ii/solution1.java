public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> results = new ArrayList<>();
        subsetsWithDupHelper(results, new ArrayList<Integer>(), nums, 0);
        
        return results;
    }
    
    private void subsetsWithDupHelper(List<List<Integer>> results, ArrayList<Integer> list, int[] nums, int startIndex) {
        results.add(new ArrayList<>(list));
        
        for (int i = startIndex; i < nums.length; ++i) {
            if (i != 0 && i != startIndex && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            subsetsWithDupHelper(results, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}