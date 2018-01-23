class ResultType {
public:
    vector<bool> vb;
    vector<int> vi;
    
    ResultType(vector<bool> vb, vector<int> vi) {
        this->vb = vb;
        this->vi = vi;
    }
};

class Solution {
public:
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    int jump(vector<int> A) {
        // wirte your code here
        vector<bool> vb(A.size(), false);
        vector<int> vi(A.size(), INT_MAX);
        
        vb[0] = true;
        for (int i = 1; i <= A[0]; ++i) {
            if (i < A.size()) {
                vb[i] = true;
                vi[i] = 1;
            } else {
                break;
            }
        }
        ResultType *rt = new ResultType(vb, vi);
        
        
        for (int i = 1; i < A.size(); ++i) {
            if (rt->vb[i] && A[i] > 0) {
                for (int j = 1; j <= A[i]; ++j) {
                    if (i+j < A.size()) {
                        rt->vb[i+j] = true;
                        rt->vi[i+j] = min(rt->vi[i+j], rt->vi[i] + 1);
                    } else {
                        break;
                    }
                }
            }
        }
        
        return rt->vi[A.size()-1];
    }
};