package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6Test {

    @Test
    void szyfr() {
        Exercise6 excercise6 = new Exercise6();

        excercise6.szyfr("NIEPRZYJACIEL JEST BARDZO BLISKO");
        excercise6.decode("QLHSUCBMDFLHO MHVW EDUGCR EOLVNR");

    }
}