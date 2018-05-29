package pl.sdacademy.pp.part3;

import jdk.nashorn.internal.ir.WhileNode;

public class CompleteTreeArray {
    private int [] heap = new int[100];
    private int left;
    private int right;
    private int amount = 0;

    public void add(int value){
        int i = amount;
        amount++;
        int j = (i - 1) / 2;
        while(i > 0 && heap[j] < value){
            heap[i] = heap[j];
            i = j;
            j = (i - 1) / 2;
        }
        heap[i] = value;

    }
    private int getLeftIndex(int index){
        return (2 * index) + 1;
    }
    public int getLeft(int index){
        return heap[getLeftIndex(index)];
    }

    private int getRightIndex(int index){
        return (2 * index) + 2;
    }

    public int getRight(int index){
        return heap[getRightIndex(index)];
    }

    public int getValue(int index){
        return heap[index];
    }
    private int getParentIndex(int index){
        return (index - 1)/2;
    }

    public int getParent(int index){
        return heap[getParentIndex(index)];
    }

    public boolean isLeaf(int index){
//        int k =(int)(Math.log(index+1)/Math.log(2));
        return (2 * index) + 2 > amount + 1;
    }

    public int getHeapSize(){
        return amount + 1;
    }

    public int removeFromTop(){

      amount--;
      int value = heap[amount];
      int prev = heap[0];
      int i = 0;
      int j = 1;
      while(j < amount){
          if (j + 1 < amount && heap[j+1] > heap[j]){
              j++;
          }
          if (value >= heap[j]){
              break;
          }
          heap[i] = heap[j];
          i = j;
          j = 2 * j + 1;
      }
      heap[i] = value;
      return prev;
    }

    public int[] heapSort(){
        int [] sorted = new int[amount];
        int j =amount - 1;
        for (int i = amount ; i > 0 ; i--){
                sorted[j] = removeFromTop();
                j--;
            }
        return sorted;
    }
}




