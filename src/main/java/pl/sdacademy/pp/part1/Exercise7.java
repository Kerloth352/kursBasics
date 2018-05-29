package pl.sdacademy.pp.part1;

public class Exercise7 {
    public boolean isADoubleWord(String word) {
        if (word.length() % 2 == 1) {
            return false;
        }

        char[] doubleWord = word.toCharArray();

        int half = doubleWord.length / 2;

        for (int i = 0; i < doubleWord.length / 2; i++) {
            if (doubleWord[i] != doubleWord[half]) {
                return false;
            } else {
                half++;
                continue;
            }
        }
        return true;

    }
}

