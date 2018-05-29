package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

class Exercise8Test {
    @Test
    void coinsTest() {
        Exercise8 exercise8 = new Exercise8();
        BigDecimal amount = new BigDecimal(1002.22 );
        exercise8.amountOfCoinsAndBankNotes(amount);
    }
}