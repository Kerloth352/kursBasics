package pl.sdacademy.pp.part3;

import java.util.List;

public class CustomTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public CustomTree(Node root) {
        this.root = root;
    }

    public int getLength(Node node){
        int maxLength = 0;
        if (node.getChildren().isEmpty()){
            return 0;
        }
        for (Node nod : node.getChildren()) {
            int length = 1;
            length += getLength(nod);
            if (length > maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }

    public void preOrder(Node node){
        System.out.println(node.getValue());
        for (Node nod : node.getChildren()) {
            preOrder(nod);
        }
    }

}
