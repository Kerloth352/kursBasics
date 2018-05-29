package pl.sdacademy.pp.part2;

public class CustomLinkedList {
    Element element = new Element(null);
    int quantity = 0;
    public Element head = null;
    public Element tail = null;

    public CustomLinkedList() {
    }

    public void add(Object object) {
        if (head == null) {
            head = new Element(object);
            tail = head;

        } else {
            Element tempNext = new Element(object);
            tail.setNext(tempNext);
            tail = tempNext;
        }
        quantity++;
    }

    public Object get(Object object) {
        element = head;
        int whichElement = 0;
        while (element.hasNext()) {
            if (element.getValue() == object) {
                return element.getValue();
            } else {
                element = element.getNext();
                whichElement++;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public Object getByIndex(int index) {
        element = head;
        if (index > quantity) {
            throw  new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            element = element.getNext();
        }
        return element.getValue();
    }

    public void remove(Object object) {
        element = head;
        Element prev = head;
        if (object.equals(head.getValue())) {
            head = head.getNext();
            quantity--;
            if (quantity == 0){
                tail = null;
            }
        } else {
            while (element.hasNext()) {
                if (object.equals(element.getValue())) {
                    prev.setNext(element.getNext());
                    element.setNext(null);
                    quantity--;
                } else {
                    prev = element;
                    element = element.getNext();
                }
            }
            if (object.equals(element.getValue()) && element.equals(tail)) {
                prev.setNext(null);
                tail = prev;
                quantity--;
                if (quantity == 0){
                    tail = null;
                }
            }
        }
    }

    public void removeByIndex(int index) {
        element = head;
        Element prev = head;
        if (index == 0) {
            head = head.getNext();
            quantity--;
            if (quantity == 0){
                tail = null;
            }
        } else {
            for (int i = 0; i < index; i++) {
                prev = element;
                element = element.getNext();
            }
            if (element.equals(tail)) {
                prev.setNext(null);
                tail = prev;
                quantity--;
                if (quantity == 0){
                    tail = null;
                }
            } else {
                prev.setNext(element.getNext());
                element.setNext(null);
                quantity--;
            }
        }
    }

    public void put(int index, Object object) {
        element = head;
        Element prev = head;
        Element toPut = new Element(object);
        if (index == 0) {
            toPut.setNext(head);
            head = toPut;
            quantity++;
        } else {
            for (int i = 0; i < index; i++) {
                prev = element;
                element = element.getNext();
            }
            prev.setNext(toPut);
            toPut.setNext(element);
            quantity++;
        }



    }

    /*for ( Element temp = head ; temp.hasNext(); temp = temp.getnext){
     *   int i = 0;
     *   if(i == index){
     *   return temp.getNext();
     *   }
     *   i++;
     *   }
     *
     *   throw IndexOutOfBoundException()*/
}
