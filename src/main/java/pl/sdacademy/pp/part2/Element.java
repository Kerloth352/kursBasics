package pl.sdacademy.pp.part2;

public class Element {
    private Object value;
    private Element next;

    public Element(Object value) {
        this.value = value;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public boolean hasNext(){
        return next != null;
    }
}
