package pl.sdacademy.pp.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    @Test
    void shapesMadeFromStars() {
        Exercise3 excercise3 = new Exercise3();

        excercise3.toTheRight(5,4);
        System.out.println();
        excercise3.diagonal(5,5);
        System.out.println();
        excercise3.rectangle(5,5);
        System.out.println();
        excercise3.theX(8);
    }
}