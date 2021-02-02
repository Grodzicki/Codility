package Leader;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
 * For example, consider array A such that
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 * Write a function
 *     class Solution { public int solution(int[] A); }
 * that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
 * For example, given array A such that
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * the function may return 0, 2, 4, 6 or 7, as explained above.
 */
public class Dominator {

    public int solution(int[] A){

        Map<Integer, Integer[]> count = new HashMap<>();
        int n = A.length;
        for(int i=0; i<n; ++i){
            if(!count.containsKey(A[i]))
                count.put(A[i], new Integer[]{0,0});
            Integer[] value = new Integer[] {count.get(A[i])[0]+1, i};
            count.put(A[i], value);
        }

        for(Map.Entry<Integer, Integer[]> m : count.entrySet()) {
            if (m.getValue()[0] > n / 2)
                return m.getValue()[1];
        }

        return -1;

    }
}
