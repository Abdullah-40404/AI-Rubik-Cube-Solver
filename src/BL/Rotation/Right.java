package BL.Rotation;
import BL.Cubie;

public class Right {

    public static void RightMovement(Cubie BOX[][]){ 
        
        Cubie x_0_3 =BOX[0][2];      Cubie x_4_3 =BOX[4][2];
        Cubie x_0_6 =BOX[0][5];      Cubie x_4_6 =BOX[4][5];
        Cubie x_0_9 =BOX[0][8];      Cubie x_4_9 =BOX[4][8];

        Cubie x_5_3 =BOX[5][2];      Cubie x_2_3 =BOX[2][2];
        Cubie x_5_6 =BOX[5][5];      Cubie x_2_6 =BOX[2][5];
        Cubie x_5_9 =BOX[5][8];      Cubie x_2_9 =BOX[2][8];

        //--------------------------------------------------

          BOX[0][2]=x_2_3;        BOX[4][2]=x_0_3;
          BOX[0][5]=x_2_6;        BOX[4][5]=x_0_6;
          BOX[0][8]=x_2_9;        BOX[4][8]=x_0_9;

          BOX[5][2]=x_4_3;        BOX[2][2]=x_5_3;
          BOX[5][5]=x_4_6;        BOX[2][5]=x_5_6;
          BOX[5][8]=x_4_9;        BOX[2][8]=x_5_9;        
        
    }
}
