package pl.sdacademy.pp.part2;

import org.junit.jupiter.api.Test;
import pl.sdacademy.pp.part2.CustomStack;

class CustomStackTest {
    @Test
    void stack() {
       CustomStack stack = new CustomStack();

       stack.push(20);
       stack.push(25);
       stack.push(30);
       System.out.println(stack.peek());
       stack.pop();

    }
}