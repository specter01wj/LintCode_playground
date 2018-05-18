/*
Our normal words do not have more than two consecutive letters. If there are three or more consecutive letters, this is a tics. Now give a word, from left to right, to find out the starting point and ending point of all tics.

 Notice
The input string length is n, n <= 100000.

Example
Given str = "whaaaaatttsup", return [[2,6],[7,9]].

Explanation:
"aaaa" and "ttt" are twitching letters, and output their starting and ending points.
Given str = "whooooisssbesssst", return [[2,5],[7,9],[12,15]].

Explanation:
"ooo", "sss" and "ssss" are twitching letters, and output their starting and ending points.
*/

import java.util.*;

public class E_1401_Twitch_Words {

    public static void main(String[] args) {

        String input = "whaaaaatttsup";
        int[][] output = twitchWords(input);
        System.out.println("input: " + (input) + "\noutput: " + Arrays.deepToString(output));

    }

    /**
     * @param str: the origin string
     * @return: the start and end of every twitch words
     */
    class Pair {
        public int L;
        public int R;
        Pair(int L, int R) {
            this.L = L;
            this.R = R;
        }
    }
     
    public static int[][] twitchWords(String str) {
        // Write your code here
        List<Pair> ans = new ArrayList<Pair>();
        char pre = ' ';
        int l = -1;
        int r = -1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != pre) {
                if(l != -1 && r - l >= 2) {
                    ans.add(new Pair(l,r));
                }
                l = i;
                r = i;
                pre = str.charAt(i);
            } else {
                r++;
            }
        }
        if(l != -1 && r - l >= 2) {
            ans.add(new Pair(l,r));
        }
        int[][] ret = new int[ans.size()][2];
        for(int i = 0; i < ans.size(); i++) {
            ret[i] = new int[2];
            ret[i][0] = ans.get(i).L;
            ret[i][1] = ans.get(i).R;
        }
        return ret;
    }

}
