class Solution {
public:
    int titleToNumber(string s) {
        long long n = 0;
        for (decltype(s.size()) i = s.size(); i != 0; --i) {
            if (!isupper(s[i-1])) {
                return -1;
            }
            n += (s[i-1] - 'A' + 1) * pow(26, (s.size() - i));
        }
        return n;
    }
};