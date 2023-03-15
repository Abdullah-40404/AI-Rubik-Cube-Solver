package BL.Rotation;
import BL.Cubie;

public class Back {

    public static void BackMovement(Cubie BOX[][]){ 
        
        Cubie x_1_7 =BOX[1][6];      Cubie x_2_7 =BOX[2][6];
        Cubie x_1_8 =BOX[1][7];      Cubie x_2_8 =BOX[2][7];
        Cubie x_1_9 =BOX[1][8];      Cubie x_2_9 =BOX[2][8];

        Cubie x_3_7 =BOX[3][6];      Cubie x_4_7 =BOX[4][6];
        Cubie x_3_8 =BOX[3][7];      Cubie x_4_8 =BOX[4][7];
        Cubie x_3_9 =BOX[3][8];      Cubie x_4_9 =BOX[4][8];

        //--------------------------------------------------

          BOX[1][6]=x_4_7;        BOX[2][6]=x_1_7;
          BOX[1][7]=x_4_8;        BOX[2][7]=x_1_8;
          BOX[1][8]=x_4_9;        BOX[2][8]=x_1_9;

          BOX[3][6]=x_2_7;        BOX[4][6]=x_3_7;
          BOX[3][7]=x_2_8;        BOX[4][7]=x_3_8;
          BOX[3][8]=x_2_9;        BOX[4][8]=x_3_9;        
        
    }
}
