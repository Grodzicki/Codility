package sorting;

/**
 * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given.
 * The J-th disc is drawn with its center at (J, 0) and radius A[J].
 * We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point
 * (assuming that the discs contain their borders).
 *
 * The figure below shows discs drawn for N = 6 and A as follows:
 *   A[0] = 1
 *   A[1] = 5
 *   A[2] = 2
 *   A[3] = 1
 *   A[4] = 4
 *   A[5] = 0
 * There are eleven (unordered) pairs of discs that intersect, namely:
 *         discs 1 and 4 intersect, and both intersect with all the other discs;
 *         disc 2 also intersects with discs 0 and 3.
 * Write a function:
 *     class Solution { public int solution(int[] A); }
 *
 * that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs.
 * The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
 */
public class NumberOfDiscIntersections {
    public int solution(int[] A){
        int pairsExceeds = 0;
        int[] B = new int[A.length];
        int aValue = 0, temp =0;

        for (int i=0; i<A.length; i++){
            B[i] = -1;
            aValue = A[i];
            if (aValue>=i) {
                B[0]++;
            } else {
                B[i-aValue]++;
            }
        }

        for (int j=0; j<A.length; j++) {
            temp += B[j];
            B[j] = temp;
        }

        for (int k=0; k<A.length; k++) {
            aValue = A[k];
            pairsExceeds += ((aValue<A.length-k) ? aValue: A.length-k-1);
            if (k != A.length-1) {
                pairsExceeds += B[((aValue<A.length-k) ? k+aValue: A.length-1)];
            }
            if (pairsExceeds>10000000) return -1;
        }
        return pairsExceeds;
    }
}