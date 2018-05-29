package pl.sdacademy.pp.part1;


/*Najdłuższy wspołny podłańcuch znaków*/

public class Exercise9 {
    public void longestChain(String word0, String word1) {
        char [] shorter;
        char [] longer;
        if (word0 == null || word1 == null){
            System.out.println("Złe dane");
        }
        if (word0.length() == word1.length()){
                shorter = word0.toCharArray();
                longer  = word1.toCharArray();
            }else if (word0.length() > word1.length()){
                longer = word0.toCharArray();
                shorter  = word1.toCharArray();
            }else{
                shorter = word0.toCharArray();
                longer  = word1.toCharArray();
            }
        int chain = 0;
        int longest = 0;
        int pos =0;
        for (int i = 0 ; i < shorter.length ; i++){
            for (int j = 0; j < longer.length; j++){
                if (shorter[i] == longer[j]){
                    chain = 1;
                    for (int it = 1 ; it + i < shorter.length && it +j < longer.length ; it++){
                        if (shorter[i+it] == longer[j+it]){
                            chain++;
                            continue;
                        }else{
                            break;
                        }
                    }
                    if (chain > longest){
                        pos = i;
                        longest = chain;
                    }
                }
            }
        }
        System.out.println("Najdluzszy wspolny ciag znakow wynosi : " + longest);
        System.out.println();
        for (int i = 0 ; i < longest ; i++){
            System.out.print(shorter[pos+i]);
        }
    }
}
