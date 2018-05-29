package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

    @Test
    void palindrom() {
        Exercise5 excercise5 = new Exercise5();

        boolean test = excercise5.czyPalindrom("kajak");
        assertTrue(test);
    }
}