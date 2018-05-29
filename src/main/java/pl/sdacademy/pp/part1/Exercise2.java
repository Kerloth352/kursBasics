package pl.sdacademy.pp.part1;

public class Exercise2 {

    public int[] seriesEveryTwo(int a) {
        if (a < 1) {
            System.out.println("Liczba elementow nie moze byc mniejsza od 1");
            a = 1;
        }
        int number = 1;
        int[] tab = new int[a];
        for (int i = 0; i < a; i++) {
            tab[i] = number;
            number += 2;
        }

        return tab;
    }

    public void seriesPointTwo(int ammountOfPairs) {

        if (ammountOfPairs < 1) {
            System.out.println("Zła ilosc wyrazow");
            ammountOfPairs = 1;
        } else {
            int number = 100;
            for (int i = 0; i < ammountOfPairs; i++) {
                System.out.println(number);
                int numberMod = number / 10;
                System.out.println(numberMod);
                number += 100;
            }

        }
    }


    public void seriesPointThree(int number) {
        if (number % 2 == 1 && number > 0) {
            for (int i = 0; i < number; i += 2) {
                System.out.println(i);
            }
            for (int i = number - 3; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("Zła liczba");
            number = 1;
        }
    }

    public void seriesPowerOfTwo(int power) {
        for (int i = 1; i <= power; i++) {
            System.out.println((int) Math.pow(i, 2));
        }
    }

    public void seriesFibonacci(int limit) {
        int first = 1;
        int second = 1;
        if (limit < 1) {
            System.out.println("Liczba wyrazów nie moze byc mniejsza od 1");
            limit = 1;
        }

        for (int i = 1; i <= limit; i++) {
            if (i == 1 || i == 2) {
                System.out.println("1");
                continue;
            } else {
                int sum = first + second;
                System.out.println(sum);
                first = second;
                second = sum;
            }
        }
    }
}

