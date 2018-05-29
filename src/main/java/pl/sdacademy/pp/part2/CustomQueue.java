package pl.sdacademy.pp.part2;

public class CustomQueue {
    Element element  = new Element(null);
    private Element front = null;
    private Element back = null;

    public void add(Object object){
        if (front == null){
            front = new Element(object);
            back = front;
        }else{
            Element temp  = new Element(object);
            temp.setNext(back);
            back = temp;
        }
    }

    public Object pull(){
        if (this.isEmpty()){
            return null;
        }else{
            Element temp = back;
            Element prev = new Element(null);
            while(temp.hasNext()){
                prev = temp;
                temp = temp.getNext();
            }
            element = front;
            front = prev;
            prev.setNext(null);
            return element.getValue();
        }
    }

    public boolean isEmpty(){
        if (front == null){
            System.out.println("Kolejka jest pusta");
            return true;
        }
        return false;
    }
}



