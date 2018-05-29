package pl.sdacademy.pp.part2;

public class CustomArrayList {
    private Object[] arr;
    private int arrayLength = 0;

    public CustomArrayList() {
        arr = new Object[50];
    }

    public CustomArrayList(int size) {
        arr = new Object[size];
    }

    public Object get(int index){
        return arr[index];
    }

    public void add(Object element){
        if (!arrayIsFull()) {
            arr[arrayLength++] = element;
        }else{
            System.out.println("Tablica jest pelna");
        }
    }

    public void add(int index ,Object element){
        if (!arrayIsFull()) {
            if (index >= arrayLength) {
                add(element);
            } else {
                for (int i = arrayLength -1 ; i >= index; i--) {
                    arr[i + 1] = arr[i];
                    if (i == index) {
                        arr[i] = element;
                    }

                }
                arrayLength++;
            }
        }else{
            System.out.println("Tablica jest pelna");
        }
    }

    public void remove(Object element){
        for(int i = 0 ;i <  arrayLength ; i++){
            if(arr[i] == element){
                for (int j = i ; j <= arrayLength   ; j++){
                    if (j == arrayLength){
                        arr[j] = null;
                        arrayLength--;
                    }else {
                        arr[j] = arr[j + 1];
                        arrayLength--;
                    }
                }
            }
        }
    }
    public void removeByIndex(int index){
        for (int j = index  ; j < arrayLength ; j++){
            if (j == arrayLength - 1){
                arr[j] = null;
                arrayLength--;
            }else{
                arr[j] = arr[j+1];
                arrayLength--;
            }
        }
    }

    public int length(){
        return arrayLength;
    }

    public boolean arrayIsFull(){
        if (arrayLength >= arr.length){
            return true;
        }else{
            return false;
        }
    }
}
