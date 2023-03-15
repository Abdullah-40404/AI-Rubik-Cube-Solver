package BL.Rotation;
import BL.Cubie;

public class Left {

    public static void LeftMovement(Cubie BOX[][]){ 
        
        Cubie x_0_1 =BOX[0][0];      Cubie x_4_1 =BOX[4][0];
        Cubie x_0_4 =BOX[0][3];      Cubie x_4_4 =BOX[4][3];
        Cubie x_0_7 =BOX[0][6];      Cubie x_4_7 =BOX[4][6];

        Cubie x_5_1 =BOX[5][0];      Cubie x_2_1 =BOX[2][0];
        Cubie x_5_4 =BOX[5][3];      Cubie x_2_4 =BOX[2][3];
        Cubie x_5_7 =BOX[5][6];      Cubie x_2_7 =BOX[2][6];

        //--------------------------------------------------

          BOX[0][0]=x_4_1;        BOX[4][0]=x_5_1;
          BOX[0][3]=x_4_4;        BOX[4][3]=x_5_4;
          BOX[0][6]=x_4_7;        BOX[4][6]=x_5_7;

          BOX[5][0]=x_2_1;        BOX[2][0]=x_0_1;
          BOX[5][3]=x_2_4;        BOX[2][3]=x_0_4;
          BOX[5][6]=x_2_7;        BOX[2][6]=x_0_7;        
        
    }
}
