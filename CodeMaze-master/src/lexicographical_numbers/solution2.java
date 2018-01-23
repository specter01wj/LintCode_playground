class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; ++i) {
            dfs(res, i, n);
        }
        
        return res;
    }
    
    private void dfs(List<Integer> res, int cur, int n) {
        if (cur > n) {
            return;
        } else {
            res.add(cur);
            for (int i = 0; i < 10; ++i) {
                if (cur * 10 + i > n) return;
                dfs(res, cur * 10 + i, n);
            }
        }
    }
}