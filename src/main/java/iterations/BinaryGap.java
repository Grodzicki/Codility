package iterations;

import java.util.List;
import java.util.TreeSet;


/**
 A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
 The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
 The number 32 has binary representation 100000 and has no binary gaps.
 Write a function:
 class Solution { public int solution(int N); }
 that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 Write an efficient algorithm for the following assumptions:
 N is an integer within the range [1..2,147,483,647].


 100% correct
 */

public class BinaryGap {

    public static int solution(int N){

        String nBinary = Integer.toBinaryString(N);
        System.out.println(nBinary);
        TreeSet<Integer> gapSizeList = new TreeSet<>();
        boolean gapStart = false;
        int size = 0;

        if(!nBinary.contains("0") || (!nBinary.contains("10") && !nBinary.contains("01"))){ //only 1
            return 0;
        }

        for(int i = 0; i < nBinary.length()-1; i++){

            if(nBinary.charAt(i) == '1' && nBinary.charAt(i+1) == '0'){
                gapStart = true;
                size++;
            } else if (gapStart && nBinary.charAt(i) == '0' && nBinary.charAt(i+1) == '0'){
                size++;
            } else if (gapStart && nBinary.charAt(i) == '0' && nBinary.charAt(i+1) == '1') {
                gapStart = false;
                gapSizeList.add(size);
                size=0;
            }

        }

        System.out.println(gapSizeList);

        if(gapSizeList.size() == 0){
            return 0;
        } else {
            return  gapSizeList.last();
        }

    }


}
