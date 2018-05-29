package pl.sdacademy.pp.part3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompleteTreeArrayTest {
    @Test
    void heap() {
        CompleteTreeArray tree = new CompleteTreeArray();
        tree.add(5);
        tree.add(3);
        tree.add(2);
        tree.add(4);
        tree.add(1);
        System.out.println(tree.getLeft(0));
        System.out.println(tree.getRight(0));
        assertTrue(tree.isLeaf(4));
        tree.removeFromTop();

      int [] sort = tree.heapSort();
      for (int ints : sort){
          System.out.println(ints);
      }
    }
}