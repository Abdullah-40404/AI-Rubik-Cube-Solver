package BL;

public class SetDefault {

    public static String to_String(Cubie BOX[][]) {

        String s = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                s += BOX[i][j].Color;
            }
        }

        return s;
    }

    public static Cubie[][] Make_Cube() {

        Cubie[][] BOX = new Cubie[6][9];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                BOX[i][j] = new Cubie();
            }
        }
        return BOX;
    }

    public static boolean Check_if_equals(Cubie BOX[][]) {

        for (int i = 0; i < 9; i++) {
            if (BOX[0][i].Color != 'Y' || BOX[1][i].Color != 'O' ||
                    BOX[2][i].Color != 'G' || BOX[3][i].Color != 'W' ||
                    BOX[4][i].Color != 'B' || BOX[5][i].Color != 'R') {
                return false;
            }

        }

        return true;
    }

    public static void Initialize_Cube(Cubie BOX[][]) {

        // - For front

        for (int i = 0; i < 9; i++) {
            BOX[0][i].Color = 'Y';
            BOX[0][i].id = i + 1;
        }

        // - For Left

        for (int i = 0; i < 9; i++) {
            BOX[1][i].Color = 'O';
            BOX[1][i].id = i + 1;
        }

        // - For Down

        for (int i = 0; i < 9; i++) {
            BOX[2][i].Color = 'G';
            BOX[2][i].id = i + 1;
        }

        // - For Right

        for (int i = 0; i < 9; i++) {
            BOX[3][i].Color = 'W';
            BOX[3][i].id = i + 1;
        }

        // - For Up

        for (int i = 0; i < 9; i++) {
            BOX[4][i].Color = 'B';
            BOX[4][i].id = i + 1;
        }
        // - For Right-Right

        for (int i = 0; i < 9; i++) {
            BOX[5][i].Color = 'R';
            BOX[5][i].id = i + 1;
        }

    }

    public static void Copy(Cubie toCopy[][], Cubie BOX[][]) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                toCopy[i][j] = BOX[i][j];
            }
        }
    }
}
