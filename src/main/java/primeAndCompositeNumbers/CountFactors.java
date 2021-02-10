package primeAndCompositeNumbers;

/**
 * A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.
 * For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).
 * Write a function:
 *     class Solution { public int solution(int N); }
 * that, given a positive integer N, returns the number of its factors.
 * For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.
 */
public class CountFactors {

    public static void main(String[] args) {
        System.out.println(solution(6));

    }

    public static int solution(int N){

        if (N==1)
            return 1;
        else if (N==2)
            return 2;
//
//        int count = 0;

//        for (int i=2; i<N; i++){
//            if (N%i == 0)
//                count++;
//        }

        int count = 0;
        int countFactor = 1;
        int nSqrt = (int) Math.ceil(Math.sqrt(N));
        int k=2; //ustawiamy k na pierwszą liczbę pierwszą
        int n = N;
        //rozkład liczby na czynniki pierwsze
        while(n>1&&k<=nSqrt)
        {
            while(n%k==0) //dopóki liczba jest podzielna przez k
            {
                count++;
                n/=k;
            }
            System.out.println(count);
            countFactor*=(++count);
            count=0;
            ++k;
        }


        return countFactor;
    }
}
