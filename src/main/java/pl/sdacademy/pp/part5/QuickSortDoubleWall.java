package pl.sdacademy.pp.part5;

public class QuickSortDoubleWall extends Sort {
    @Override
    void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = end - start / 2;

        for (int i = start; i < end; i++) {
            if (arr[i] >= arr[pivot]) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] <= arr[pivot]) {
                        swap(arr, i, j);
                    }
                }
            }
        }

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }
}
