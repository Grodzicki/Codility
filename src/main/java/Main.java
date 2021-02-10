import arrays.CyclicRotation;
import arrays.OddOccurrencesInArray;
import countingElements.MaxCounters;
import countingElements.MissingInteger;
import iterations.BinaryGap;
import prefixSums.GenomicRangeQuery;
import timeComplexity.PermMissingElem;
import timeComplexity.TapeEquilibrium;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");

        String s = "He is a very very good boy, isn't he?";

        String[] split = s.split("'|\\?|\\!|,\\s+|\\s+");

        Scanner scan = new Scanner(System.in);
        long l = Long.parseUnsignedLong("453435");
        for (String s1 : split) {
            System.out.println(s1);
        }

////        binaryGapTest();
//        cyclicRotationTest();
//        oddOccurrencesInArrayTest();

//        System.out.println(FrogJmp.solution(10,85,30));
//        System.out.println(FrogJmp.solution(10,185,30));
//
//        permMissingElemTest();
//
//        tapeEquilibriumTest();

//        maxCountersTest();
//
//        missingIntegerTest();

//        genomicRangeQueryTest();


    }

    public static void genomicRangeQueryTest(){
        System.out.println(GenomicRangeQuery.solution("CAGCCTA", new int[]{2,5,0}, new int[]{4,5,6}));;
    }

    public static void binaryGapTest(){
        System.out.println("size gap: " + BinaryGap.solution(4));
        System.out.println("size gap: " + BinaryGap.solution(15));
        System.out.println("size gap: " + BinaryGap.solution(20));
        System.out.println("size gap: " + BinaryGap.solution(1041));
        System.out.println("size gap: " + BinaryGap.solution(581));
    }

    public static void cyclicRotationTest(){
        int[] temp = new int[]{1,2,3,4,5};

        for(int a : CyclicRotation.solution(temp,5)){
            System.out.print(a);
        }
        System.out.println();

        for(int a : CyclicRotation.solution(temp,4)){
            System.out.print(a);
        }
        System.out.println();

        for(int a : CyclicRotation.solution(temp,0)){
            System.out.print(a);
        }
        System.out.println();

        for(int a : CyclicRotation.solution(temp,11)){
            System.out.print(a);
        }
        System.out.println();


    }

    public static void oddOccurrencesInArrayTest(){
        System.out.println(OddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9}));
        System.out.println(OddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9,7,10}));
    }

    public static void permMissingElemTest(){
        System.out.println("miss: " + PermMissingElem.solution(new int[]{2,3,1,5}));
        System.out.println("miss: " + PermMissingElem.solution(new int[]{2,3,1,5,4,7}));
        System.out.println("miss: " + PermMissingElem.solution(new int[]{4,3,1,5}));
    }

    public static void tapeEquilibriumTest(){
        System.out.println(TapeEquilibrium.solution(new int[]{3,1,2,4,3}));
        System.out.println(TapeEquilibrium.solution(new int[]{4,1,2,4,3}));
    }

    public static void maxCountersTest(){
        for(int a : MaxCounters.solution(5,new int[]{3,4,4,6,1,4,4})){
            System.out.print(a + ",");
        }
        System.out.println();

    }

    public static void missingIntegerTest(){
        System.out.println(MissingInteger.solution(new int[]{1,2,3}));
        System.out.println(MissingInteger.solution(new int[]{-1,-4}));
        System.out.println(MissingInteger.solution(new int[]{1,3,6,4,1,2}));

    }
}
