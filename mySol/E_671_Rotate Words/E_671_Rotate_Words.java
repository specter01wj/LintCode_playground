/*
The words are same rotate words if rotate the word to the right by loop, and get another. Count how many different rotate word sets in dictionary.

E.g. picture and turepic are same rotate words.

 Notice
All words are lowercase.

Example
Given dict = ["picture", "turepic", "icturep", "word", "ordw", "lint"]
return 3.

"picture", "turepic", "icturep" are same ratote words.
"word", "ordw" are same too.
"lint" is the third word that different from the previous two words.
*/

import java.util.*;

public class E_671_Rotate_Words {

    public static void main(String[] args) {

        List<String> input = Arrays.asList("picture", "turepic", "icturep", "word", "ordw", "lint");
        int output = countRotateWords(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param words: A list of words
     * @return: Return how many different rotate words
     */
    public static int countRotateWords(List<String> words) {
        // Write your code here
        if (words == null || words.size() == 0) {
            return 0;
        }
        
        Set<String> set = new HashSet<>();
        for (String word: words) {
            boolean exist = false;
            for (int i = 0; i < word.length(); i++) {
                String cur = word.substring(i, word.length()) + 
                             word.substring(0, i);
                if (set.contains(cur)) {
                    exist = true;
                    break;
                }
            }
            if (exist == false) {
                set.add(word);
            }
        }
        return set.size();
    }

}
