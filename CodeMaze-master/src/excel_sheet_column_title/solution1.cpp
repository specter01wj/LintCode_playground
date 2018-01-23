class Solution {
public:
    string convertToTitle(int n) {
        if (n <= 0) {
            return "ERROR";
        }
        string s = "";
        
        while (n > 0) {
            s = string(1, 'A' + (n - 1) % 26) + s;
            n = (n - 1) / 26;
        }
        
        return s;
    }
};