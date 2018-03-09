/*
Cosine similarity is a measure of similarity between two vectors of an inner product space that measures the cosine of the angle between them. The cosine of 0° is 1, and it is less than 1 for any other angle.

See wiki: Cosine Similarity

Here is the formula:

cosine-similarity

Given two vectors A and B with the same size, calculate the cosine similarity.

Return 2.0000 if cosine similarity is invalid (for example A = [0] and B = [0]).

Example
Given A = [1, 2, 3], B = [2, 3 ,4].

Return 0.9926.

Given A = [0], B = [0].

Return 2.0000
*/

import java.util.*;

public class E_445_Cosine_Similarity {

    public static void main(String[] args) {

        int[] input1 = {1, 2, 3};
        int[] input2 = {2, 3 ,4};
        double output = cosineSimilarity(input1, input2);
        System.out.println("input1: " + Arrays.toString(input1) + " input2: " + Arrays.toString(input2) + "\noutput: " + output);

    }

    /*
     * @param A: An integer array
     * @param B: An integer array
     * @return: Cosine similarity
     */
    public static double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        if (A.length != B.length) return 2.0;
        double sum = 0.0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }

        long ssA = getSquaredSum(A);
        long ssB = getSquaredSum(B);

        if (ssA == 0 || ssB == 0) return 2.0;

        return sum / (Math.sqrt(ssA) * Math.sqrt(ssB));
    }
    
    private static long getSquaredSum(int[] a) {
        long sum = 0;
        for (int i : a) {
            sum += i * i;
        }
        return sum;
    }

}
