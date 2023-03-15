package BL.Rotation;
import BL.Cubie;

public class Down {

    public static void DownMovement(Cubie BOX[][]){ 
        
        Cubie x_0_7 =BOX[0][6];      Cubie x_1_7 =BOX[1][6];
        Cubie x_0_8 =BOX[0][7];      Cubie x_1_8 =BOX[1][7];
        Cubie x_0_9 =BOX[0][8];      Cubie x_1_9 =BOX[1][8];

        Cubie x_3_7 =BOX[3][6];      Cubie x_5_7 =BOX[5][6];
        Cubie x_3_8 =BOX[3][7];      Cubie x_5_8 =BOX[5][7];
        Cubie x_3_9 =BOX[3][8];      Cubie x_5_9 =BOX[5][8];

        //--------------------------------------------------

          BOX[0][6]=x_1_7;        BOX[1][6]=x_5_7;
          BOX[0][7]=x_1_8;        BOX[1][7]=x_5_8;
          BOX[0][8]=x_1_9;        BOX[1][8]=x_5_9;

          BOX[3][6]=x_0_7;        BOX[5][6]=x_3_7;
          BOX[3][7]=x_0_8;        BOX[5][7]=x_3_8;
          BOX[3][8]=x_0_9;        BOX[5][8]=x_3_9;              
    }
}
