package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise7Test {

    @Test
    void doubleWordTest() {
        Exercise7 exercise7 = new Exercise7();

        boolean test = exercise7.isADoubleWord("ABBCABBC");
        assertTrue(test);
    }
}