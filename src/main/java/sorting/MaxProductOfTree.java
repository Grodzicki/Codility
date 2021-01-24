package sorting;

import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
 * For example, array A such that:
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 * contains the following example triplets:
 *         (0, 1, 2), product is −3 * 1 * 2 = −6
 *         (1, 2, 4), product is 1 * 2 * 5 = 10
 *         (2, 4, 5), product is 2 * 5 * 6 = 60
 * Your goal is to find the maximal product of any triplet.
 * Write a function:
 *     class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A, returns the value of the maximal product of any triplet.
 * For example, given array A such that:
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 * the function should return 60, as the product of triplet (2, 4, 5) is maximal.
 */

public class MaxProductOfTree {
    public int solution(int[] A) {
        if(A.length == 3){
            return A[0]*A[1]*A[2];
        }
        int returnValue = 0;
        int[] B = Arrays.copyOf(A,A.length);

        Arrays.sort(B);
        int bLength = B.length;
        int lValue = (B[0]*B[1]*B[2]) < (B[0]*B[1]*B[bLength-1]) ? B[0]*B[1]*B[bLength-1] : B[0]*B[1]*B[2];
        int rValue = B[bLength-1]*B[bLength-2]*B[bLength-3];

        returnValue = lValue < rValue ? rValue:lValue;

        return returnValue;
    }
}
