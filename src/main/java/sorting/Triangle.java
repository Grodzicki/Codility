package sorting;

import java.util.Arrays;

/**
 * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 *         A[P] + A[Q] > A[R],
 *         A[Q] + A[R] > A[P],
 *         A[R] + A[P] > A[Q].
 * For example, consider array A such that:
 *   A[0] = 10    A[1] = 2    A[2] = 5
 *   A[3] = 1     A[4] = 8    A[5] = 20
 * Triplet (0, 2, 4) is triangular.
 * Write a function:
 *     class Solution { public int solution(int[] A); }
 * that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 * For example, given array A such that:
 *   A[0] = 10    A[1] = 2    A[2] = 5
 *   A[3] = 1     A[4] = 8    A[5] = 20
 * the function should return 1, as explained above. Given array A such that:
 *   A[0] = 10    A[1] = 50    A[2] = 5
 *   A[3] = 1
 * the function should return 0.
 */

public class Triangle {

    public int solution(int[] A){

        Arrays.sort(A);

        for(int i=0;i<A.length-2;i++){
            if(((long)A[i] + (long)A[i+1] > A[i+2]) &&
               ((long)A[i+1] + (long)A[i+2] > A[i]) &&
               ((long)A[i] + (long)A[i+2] > A[i+1]))
            return 1;
        }
        return 0;
    }
}
