package pl.sdacademy.pp.part2;

import org.junit.jupiter.api.Test;
import pl.sdacademy.pp.part2.CustomQueue;

class CustomQueueTest {

    @Test
    void queue() {
        CustomQueue queue = new CustomQueue();

        queue.add(20);
        queue.add(25);
        queue.add(30);
        System.out.println(queue.pull());

    }
}