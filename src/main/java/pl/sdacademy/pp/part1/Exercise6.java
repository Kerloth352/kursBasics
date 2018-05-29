package pl.sdacademy.pp.part1;

/*Szyfr cezara.*/

public class Exercise6 {
    static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public void szyfr(String words) {
        words.toUpperCase();
        System.out.println(words);
        String [] wordSplit = words.split(" ");
        for(String singleWords : wordSplit){
            char [] word = singleWords.toCharArray();
            for (int i = 0; i < word.length; i++) {
                int val = (int) word[i] - 65;
                System.out.print(alphabet[(val + 3)%26 ]);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public void decode(String code) {
        String [] split = code.split(" ");
        for(String parts : split){
            char [] array = parts.toCharArray();
            for (int i = 0; i < array.length; i++) {
                int value = (int) array[i] - 65;
                if (value == 2) {System.out.print("Z");}
                else if (value == 1) {System.out.print("Y");}
                else if(value == 0) {System.out.print("Z");}
                else {
                    System.out.print(alphabet[(value - 3) % 26]);
                }
            }
            System.out.print(" ");
        }

    }
}
