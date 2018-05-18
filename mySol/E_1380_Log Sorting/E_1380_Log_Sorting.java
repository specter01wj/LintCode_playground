/*
Give a log, consisting of List< String >, each element representing one line of logs. Each line of log information is separated by a space. The first is the ID of the log, followed by the log content.
There are two ways to make content:
1. All consist of letters and spaces.
2. All consist of numbers and spaces.
Now that the logs are sorted, it is required that component 1 be sorted in order of content lexicography and placed at the top, and component 2 should be placed at the bottom and output in the order of input. (Note that the space also belongs to the content, and when the lexicographic order of the composition method 1 is equal, sort according to the dictionary order of log ID., and the guarantee ID is not repeated)

 Notice
The total number of logs entered was n, and n < = 10000.

The length of each line is mi, and mi < = 100.

Example
Given

[
    "zo4 4 7",
    "a100 Act zoo",
    "a1 9 2 3 1",
    "g9 act car"
]
, return

[
    "a100 Act zoo",
    "g9 act car",
    "zo4 4 7",
    "a1 9 2 3 1"
]
Explanation:
"Act zoo" < "act car", So the output is as above.
Given

[
    "zo4 4 7",
    "a100 Actzoo",
    "a100 Act zoo",
    "Tac Bctzoo",
    "Tab Bctzoo",
    "g9 act car"
]
, return

[
    "a100 Act zoo",
    "a100 Actzoo",
    "Tab Bctzoo",
    "Tac Bctzoo",
    "g9 act car",
    "zo4 4 7"
]
Explanation:
Because "Bctzoo" == "Bctzoo", the comparison "Tab" and "Tac" have "Tab" < Tac ", so" Tab Bctzoo "< Tac Bctzoo".
Because ' '<'z', so "A100 Act zoo" < A100 Actzoo".
*/

import java.util.*;

public class E_1380_Log_Sorting {

    public static void main(String[] args) {

        String[] input = {"zo4 4 7", "a100 Act zoo", "a1 9 2 3 1", "g9 act car"};
        String[] output = logSort(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param logs: the logs
     * @return: the log after sorting
     */
    class MyCompartor implements Comparator {
        @Override
        public int compare(Object a1, Object a2) {
            String o1 = (String)a1;
            String o2 = (String)a2;
            int idx1 = o1.indexOf(' ');
            int idx2 = o2.indexOf(' ');
            String head1 = o1.substring(0, idx1);
            String head2 = o2.substring(0, idx2);
            String body1 = o1.substring(idx1);
            String body2 = o2.substring(idx2);
            if(body1.equals(body2)) {
                return head1.compareTo(head2);
            } else {
                return body1.compareTo(body2);
            }
        }
    }
     
    public static String[] logSort(String[] logs) {
        // Write your code here
        List<String> list = new ArrayList<String>();
        String [] ans = new String[logs.length];
        int cnt = logs.length - 1;
        for(int i = logs.length - 1; i >= 0; i--) {
            int index = logs[i].indexOf(' ');
            String body = logs[i].substring(index + 1);
            if(body.charAt(0) >= '0' && body.charAt(0) <= '9') {
                ans[cnt--] = logs[i];
            } else {
                list.add(new String(logs[i]));
            }
        }
        MyCompartor mc = new MyCompartor();
        Collections.sort(list, mc);
        
        cnt = 0;
        for(String i: list) {
            ans[cnt++] = i; 
        }
        return ans;
    }

}
