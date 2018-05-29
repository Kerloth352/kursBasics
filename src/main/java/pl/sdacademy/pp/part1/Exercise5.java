package pl.sdacademy.pp.part1;

public class Exercise5 {
    public boolean czyPalindrom(String word) {
        char[] array = word.toCharArray();
        int i = 0;
        int j = array.length - 1;
        while (i < array.length / 2) {

            if (array[i] != array[j]) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;

    }
}
