package pl.sdacademy.pp.part4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void bubble() {
        int [] numbers = {5,2,1,4,3,4,5,2,1,0};
        Sort sort = new Sort();
        int [] sorted = sort.bubbleSort(numbers);
        for (int val : sorted) {
            System.out.println(val);
        }
        System.out.println();
        sorted = sort.countingSort(numbers);
        for (int val : sorted) {
            System.out.println(val);
        }
        System.out.println();
        sorted = sort.insertionSort(numbers);
        for (int val : sorted) {
            System.out.println(val);
        }
    }
}