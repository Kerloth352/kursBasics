package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    void series() {
        Exercise2 excercise2 = new Exercise2();
        int[] array;
        array = excercise2.seriesEveryTwo(28);
        for(int ar : array){
            System.out.println(ar);
        }
        System.out.println();
        excercise2.seriesPointTwo(3);
        System.out.println();
        excercise2.seriesPointThree(7);
        System.out.println();
        excercise2.seriesPowerOfTwo(6);
        System.out.println();
        excercise2.seriesFibonacci(9);
    }
}