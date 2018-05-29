package pl.sdacademy.pp.part3;

public class BinaryNode {
    private String value;
    private BinaryNode left;
    private BinaryNode right;
    private boolean visited;

    public BinaryNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void view() {
        if(!isVisited()){
            System.out.println(getValue());
            setVisited(true);
        }
    }
    public void flag(){
        if (isVisited()) {
            setVisited(false);
        }
    }
}
