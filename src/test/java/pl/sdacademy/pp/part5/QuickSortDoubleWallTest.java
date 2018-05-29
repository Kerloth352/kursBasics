package pl.sdacademy.pp.part5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortDoubleWallTest {

    @Test
    void quicksort() {
        int [] numbers = {5,7,9,6,3,4,1,2,0,8};
        Sort quick = new QuickSortDoubleWall();
        quick.sort(numbers);
        for (int val : numbers) {
            System.out.println(val);
        }
    }
}