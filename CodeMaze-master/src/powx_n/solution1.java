class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        if (n > 0) {
            ans = fastPow(x, n);
        } else if (n < 0) {
            // corner case!!! trick, or just use long type!
            if (n == Integer.MIN_VALUE) n += 2; 
            ans = fastPow(x, -1 * n);
            ans = 1.0 / ans;
        }
        
        return ans;
    }
    
    private double fastPow(double x, int n) {
        if (n < 2) return x;
        double half_n = fastPow(x, n / 2);
        return n % 2 == 0 ? half_n * half_n : half_n * half_n * x;
    }
}