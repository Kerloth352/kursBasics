package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise9Test {
    @Test
    void chains() {
        Exercise9 exercise9 = new Exercise9();

        exercise9.longestChain("AAABBA","ABAABBAAA");
    }
}