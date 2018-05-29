package pl.sdacademy.pp.part1;

public class Exercise3 {
    public void toTheRight(int height, int width) {
        if (height < 1 || width < 1) {
            System.out.println("Wysokosc lub szerokosc nie moze byc mniejsza od 1");
            height = 1;
            width = 1;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i & j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void diagonal(int height, int width) {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < i && j < width; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }

    public void rectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                System.out.println();
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.println();
                System.out.print("*");
                for (int j = 0; j < width - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }
        }
    }

    public void theX(int size) {
        int[][] tab = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (tab[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }

            }
            System.out.println();

        }
    }
}
