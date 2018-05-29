package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {
    @Test
    void sumOfInput() {
        Exercise4 excercise4 = new Exercise4();

        excercise4.inputSum("C:\\kurs\\sda\\sda-programowanie-1\\src\\main\\java\\pl\\sdacademy\\pp\\part1\\numbers.txt");
    }
}