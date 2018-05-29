package pl.sdacademy.pp.part4;

public class Sort {


   public int[] bubbleSort(int [] numbers){
       int changes = 1;
       while(changes != 0) {
           changes = 0;
           for (int i = 0; i < numbers.length - 1; i++) {
               if (numbers[i] > numbers[i + 1]) {
                   int temp = numbers[i];
                   numbers[i] = numbers[i+1];
                   numbers[i+1] = temp;
                   changes++;
               }
           }
       }
       return numbers;
   }

   public int[] countingSort(int [] numbers){
       int [] counter = new int [6];
       int [] ret = new int[numbers.length];

       for (int i = 0; i < numbers.length; i++) {
           ++counter[numbers[i]];
       }

       int k = 0;
       for (int i = 0; i < counter.length ; i++){
           for (int j = 0; j < counter[i]; j++ ){
               ret[k] = i;
               k++;
           }
       }
       return ret;
   }

   public int[] insertionSort(int [] numbers){
       int i = 1;
       while(i < numbers.length){
           int x = numbers[i];
           int j = i - 1;
           while(j >= 0 && numbers[j] > x){
               numbers[j+1] = numbers[j];
               j--;
           }
           numbers[j+1] = x;
           i++;
       }
       return numbers;
   }
}

