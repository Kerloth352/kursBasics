package pl.sdacademy.pp.part2;

import org.junit.jupiter.api.Test;
import pl.sdacademy.pp.part2.CustomLinkedList;

class CustomLinkedListTest {
    @Test
    void list() {
        CustomLinkedList list = new CustomLinkedList();


        list.add(70);
        list.add(80);
        System.out.println(list.getByIndex(0));
        list.remove(70);
        list.add(90);
    }
}