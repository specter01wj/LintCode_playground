class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;
        Queue<Integer> queue = new LinkedList<>();
        
        int isPositive = x >= 0 ? 1 : -1;
        x = Math.abs(x);
        
        while (x > 9) {
            queue.offer(x % 10);
            x /= 10;
        }
        queue.offer(x);
        
        int result = queue.poll();
        
        while (result == 0 && !queue.isEmpty()) {
            result = queue.poll();
        }
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            int oldResult = result;
            result = oldResult * 10 + tmp;
            if (oldResult != (result - tmp) / 10) return 0;
        }
        return result * isPositive;
    }
}