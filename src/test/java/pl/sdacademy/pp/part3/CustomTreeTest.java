package pl.sdacademy.pp.part3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomTreeTest {

 /*   @Test
    void BinaryTree() {
       Node root = new Node("A");
       Node nodeB = new Node("B");
       Node nodeC = new Node("C");
       root.addChildBinary(nodeB);
       root.addChildBinary(nodeC);
       Node nodeD = new Node("D");
       Node nodeE = new Node("E");
       nodeB.addChildBinary(nodeD);
       nodeB.addChildBinary(nodeE);
       CustomTree tree = new CustomTree(root);
       System.out.println(root);
    }*/

    @Test
    void tree() {
        Node root = new Node("F");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeA = new Node("A");
        Node nodeG = new Node("G");
        Node nodeH = new Node("H");
        Node nodeI = new Node("I");
        root.addChild(nodeB);
        root.addChild(nodeG);
        nodeB.addChild(nodeA);
        nodeB.addChild(nodeD);
        nodeD.addChild(nodeC);
        nodeD.addChild(nodeE);
        nodeG.addChild(nodeI);
        nodeI.addChild(nodeH);
        CustomTree tree = new CustomTree(root);
        System.out.println(root);
        System.out.println(tree.getLength(root));
    }
}