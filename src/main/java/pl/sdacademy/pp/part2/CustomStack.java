package pl.sdacademy.pp.part2;

public class CustomStack {
    Element element =  new Element(null);
    private Element bottom = null;
    private Element top = null;

    public void push(Object object){
        if (top == null){
            top = new Element(object);
            bottom = top;
        }else{
            Element temp = new Element(object);
            temp.setNext(top);
            top = temp;
        }

    }

    public Object pop(){
        if (this.isEmpty()){
            return null;
        }else if (!top.hasNext()){
            top = null;
            bottom = null;
            return null;
        }else {
            top = top.getNext();
        }
        return top.getValue();
    }

    public Object peek(){
        if (this.isEmpty()){
            return null;
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        if (top == null){
            System.out.println("Stos jest pusty");
            return true;
        }
        return false;
    }
}
