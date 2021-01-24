package countingElements;

public class FrogRiverOne {

    public static int solution(int x, int[] a){

        int jumpCounter = x;
        int[] positionArray = new int[x + 1];

        for (int i = 0; i < a.length; i++) {

            if (positionArray.length >= a[i]) {

                if (positionArray[a[i]] == 0)
                    jumpCounter--;

                if (jumpCounter == 0)
                    return i;

                positionArray[a[i]]++;
            }

        }

        return -1;
    }
}
