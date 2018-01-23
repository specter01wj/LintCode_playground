public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        subsetsHelper(results, new ArrayList<Integer>(), nums, 0);
        
        return results;
    }
    
    private void subsetsHelper(List<List<Integer>> results, ArrayList<Integer> list, int[] nums, int startIndex) {

        // deep copy subset & add to results
        results.add(new ArrayList<>(list));
        
        for (int i = startIndex; i < nums.length; ++i) {
            list.add(nums[i]);
            subsetsHelper(results, list, nums, i + 1); // does not really understand why use i + 1
            list.remove(list.size() - 1);
        }
    }
}