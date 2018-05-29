package pl.sdacademy.pp.part3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    @Test
    void binaryTree() {
        BinaryNode root = new BinaryNode("F");
        BinaryTree binaryTree = new BinaryTree(root);
        BinaryNode nodeB = new BinaryNode("B");
        BinaryNode nodeC = new BinaryNode("C");
        BinaryNode nodeD = new BinaryNode("D");
        BinaryNode nodeE = new BinaryNode("E");
        BinaryNode nodeA = new BinaryNode("A");
        BinaryNode nodeG = new BinaryNode("G");
        BinaryNode nodeH = new BinaryNode("H");
        BinaryNode nodeI = new BinaryNode("I");
        root.setLeft(nodeB);
        root.setRight(nodeG);
        nodeB.setLeft(nodeA);
        nodeB.setRight(nodeD);
        nodeD.setLeft(nodeC);
        nodeD.setRight(nodeE);
        nodeG.setRight(nodeI);
        nodeI.setLeft(nodeH);
        binaryTree.inOrder(root);
        System.out.println();
        binaryTree.postOrder(root);
    }
}