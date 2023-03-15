package UI;

import BL.Cubie;

public class PrintCube {

    public static void PrintCube(Cubie BOX[][]) {

        System.out.print('\n');
        System.out.print("\t");
        for (int i = 0; i < 9; i++) { // Blue
            System.out.print(" " + BOX[4][i].Color);
            if ((i + 1) % 3 == 0 && i + 1 != 9) {
                System.out.print('\n');
                System.out.print("\t");
            } else {
            }
        }

        System.out.print("\n\n");

        for (int i = 0; i < 9; i = i + 3) { // Orange

            for (int j = i; j < i + 3; j++) {
                System.out.print(" " + BOX[1][j].Color);
                if ((j + 1) % 3 == 0) {
                    System.out.print('\t');
                } else {
                }
            }

            for (int j = i; j < i + 3; j++) { // Yellow
                System.out.print(" " + BOX[0][j].Color);
                if ((j + 1) % 3 == 0) {
                    System.out.print('\t');
                } else {
                }
            }

            for (int j = i; j < i + 3; j++) { // Wight
                System.out.print(" " + BOX[3][j].Color);
                if ((j + 1) % 3 == 0) {
                    System.out.print('\t');
                } else {
                }
            }

            for (int j = i; j < i + 3; j++) { // Red
                System.out.print(" " + BOX[5][j].Color);
                if ((j + 1) % 3 == 0) {
                    System.out.print('\t');
                } else {
                }
            }

            System.out.print('\n');

        }

        System.out.print("\n\t");

        for (int i = 0; i < 9; i++) { // Yellow
            System.out.print(" " + BOX[2][i].Color);
            if ((i + 1) % 3 == 0) {
                System.out.print("\n\t");
            } else {
            }
        }

    }
}
