package pl.sdacademy.pp.part5;

abstract public class Sort {
    abstract void sort(int[] arr);

    void swap(int[] arr,int i,int j){
        if(i != j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
