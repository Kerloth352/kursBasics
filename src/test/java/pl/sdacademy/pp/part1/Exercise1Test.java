package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;
import pl.sdacademy.pp.part1.Exercise1;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {
    @Test
    void shouldReturnPrimeNumber() {
        Exercise1 exercise1 = new Exercise1();
        boolean primeNumber = exercise1.isPrimeNumber(5);
        assertTrue(primeNumber);
        primeNumber = exercise1.isPrimeNumber(13);
        assertTrue(primeNumber);
        primeNumber = exercise1.isPrimeNumber(7);
        assertTrue(primeNumber);
        primeNumber = exercise1.isPrimeNumber(11);
        assertTrue(primeNumber);
    }
}