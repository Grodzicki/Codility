package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Write a function
 *     class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, returns the number of distinct values in array A.
 * For example, given array A consisting of six elements such that:
 *  A[0] = 2    A[1] = 1    A[2] = 1
 *  A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 */
public class Distinct {

    public static int solution(int[] A){

        Set<Integer> aSet = new HashSet<>();
        for (int aValue : A){
            aSet.add(aValue);
        }

        return aSet.size();
    }
}
