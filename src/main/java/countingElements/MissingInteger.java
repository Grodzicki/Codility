package countingElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Write a function:
 *     class Solution { public int solution(int[] A); }
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * Given A = [1, 2, 3], the function should return 4.
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *  N is an integer within the range [1..100,000];
 *  each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class MissingInteger {

    public static int solution(int[] A){

//          88% - to long
//        Set<Integer> aSet = Arrays.stream(A).boxed().collect(Collectors.toSet());
//        int maxValue = Collections.max(aSet);
//
//        if(maxValue <= 0){
//            return 1;
//        }
//
//        for(int i=1; i<maxValue; i++ ){
//            if(!aSet.contains(i))
//                return i;
//        }
//
//        return maxValue+1;

//        100%
        Arrays.sort(A);
        int mimInt = 1;
        if (A[A.length - 1] < 0) {
            return 1;
        } else {
            for(int i = 0; i < A.length; ++i) {
                if (A[i] >= 0) {
                    if (A[i] == mimInt) {
                        ++mimInt;
                    } else if (A[i] > mimInt) {
                        return mimInt;
                    }
                }
            }

            return A[A.length - 1] + 1;
        }
    }
}
