package pl.sdacademy.pp.part3;

public class BinaryTree {
    private BinaryNode root;

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public void inOrder(BinaryNode node){
       if (node.getLeft() != null){
           inOrder(node.getLeft());
       }
        node.view();
        if (node.getRight() != null){
           inOrder(node.getRight());
       }
       node.flag();
    }

    public void postOrder(BinaryNode node){
        if (node.getLeft() != null){
            postOrder(node.getLeft());
        }
        if (node.getRight() != null){
            postOrder(node.getRight());
        }
        node.view();
        node.flag();
    }
}
