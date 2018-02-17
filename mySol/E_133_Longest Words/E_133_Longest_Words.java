/*
Given a dictionary, find all of the longest words in the dictionary.

Example
Given

{
  "dog",
  "google",
  "facebook",
  "internationalization",
  "blabla"
}
the longest words are(is) ["internationalization"].

Given

{
  "like",
  "love",
  "hate",
  "yes"
}
the longest words are ["like", "love", "hate"].
*/

import java.util.*;

public class E_133_Longest_Words {

    public static void main(String[] args) {

        String[] input = { "dog", "google", "facebook", "internationalization", "blabla" };
        List<String> output = longestWords(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public static List<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> result = new ArrayList<>();
        int max = -1;
        for (String word : dictionary) {
            if (word.length() > max) {
                result = new ArrayList<>();
                result.add(word);
                max = word.length();
            } else if (word.length() == max) {
                result.add(word);
            }
        }
        return result;
    }

}
