class Solution {
    public double myPow(double x, int n) {
        double result = x;
        if (n > 0) {
            while (n > 1) {
                result *= x;
                n--;
            }
        } else if (n < 0) {
            n *= -1;
             while (n > 1) {
                result *= x;
                n--;
            }
            result = 1.0 / result;
        } else {
            result = 1.0;
        }
        
        return result;
    }
}