class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        
        results.add(new ArrayList<>());
        
        for (int i : nums) {
            List<List<Integer>> tmp_results = new ArrayList<>(results);
            for (List<Integer> list : tmp_results) {
                List<Integer> tmp = new ArrayList<>(list);
                tmp.add(i);
                results.add(tmp);
            }
        }
        
        return results;
    }
}