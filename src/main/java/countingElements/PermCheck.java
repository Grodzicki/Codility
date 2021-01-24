package countingElements;

import java.util.Arrays;

public class PermCheck {

    public static int solution(int[] A){

        Arrays.sort(A);
        if(A[A.length-1] != A.length){
            return 0;
        }

        for(int i=0; i<A.length; i++){
            if(A[i]-1 != i){
                return 0;
            }
        }

        return 1;
    }
}
