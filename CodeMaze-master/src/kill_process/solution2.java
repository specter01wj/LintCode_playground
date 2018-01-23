class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        if (ppid.get(pid.indexOf(kill)) == 0) return pid;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < pid.size(); ++i) {
            map.putIfAbsent(ppid.get(i), new ArrayList<Integer>());
            map.get(ppid.get(i)).add(pid.get(i));
        }
        
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(kill);
        
        while (!queue.isEmpty()) {
            Integer i = queue.poll();
            result.add(i);
            if (map.containsKey(i)) {
                queue.addAll(map.get(i));
            }
        }
        
        return result;
    }
}