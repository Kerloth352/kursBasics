package pl.sdacademy.pp.part5;


public class QuickSort {
    public void quickSortEnd(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = arr[end];
        int wall = start - 1;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[++wall];
                arr[wall] = temp;
            }
        }
        int temp = arr[++wall];
        arr[wall] = arr[end];
        arr[end] = temp;

        quickSortEnd(arr, start, wall - 1);
        quickSortEnd(arr, wall + 1, end);


    }
}
