package pl.sdacademy.pp.part3;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String value;
    private List<Node> children;
    private boolean visited;

    public Node(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public String getValue() {
        return value;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child){
        if (children.size() < 2) {
            children.add(child);
        }else{
            throw new RuntimeException("Cannot add more than two elements");
        }

    }

    public Node getLeft(){
        if (children.size() > 0) {
            return children.get(0);
        }else{
            return null;
        }
    }



    @Override
    public String toString() {
        String s = "Node: " + value + ", child : (";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        for (Node node : getChildren()) {
            stringBuilder.append(" ");
            stringBuilder.append(node.getValue());
            stringBuilder.append(", ");
        }
        stringBuilder.append(") \n");
        for (Node node : getChildren()) {
            stringBuilder.append(node.toString());
        }
        return stringBuilder.toString();
    }

}
