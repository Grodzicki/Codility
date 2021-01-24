package countingElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MaxCounters {

    public static int[] solution(int N, int[] A){

        int[] countersArray = new int[N];
        int max = 0;

        for(int aValue : A){
            if(aValue != N+1) {
                countersArray[aValue-1]++;
                if (countersArray[aValue-1] > max) {
                    max = countersArray[aValue-1];
                }
            } else {
                Arrays.fill(countersArray,max);
            }
        }

        return countersArray;
    }


}
