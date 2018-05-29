package pl.sdacademy.pp.part5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    void quick() {
        int [] numbers = {10,24,25,12,13,15,17,2,13,25,11};
        QuickSort quick = new QuickSort();
        quick.quickSortEnd(numbers,0,numbers.length - 1);
        for (int val : numbers) {
            System.out.println(val);
        }
    }
}