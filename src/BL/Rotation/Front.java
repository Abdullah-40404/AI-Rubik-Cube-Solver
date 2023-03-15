package BL.Rotation;
import BL.Cubie;

public class Front {

    public static void FrontMovement(Cubie BOX[][]){ 
        
        Cubie x_1_1 =BOX[1][0];      Cubie x_2_1 =BOX[2][0];
        Cubie x_1_2 =BOX[1][1];      Cubie x_2_2 =BOX[2][1];
        Cubie x_1_3 =BOX[1][2];      Cubie x_2_3 =BOX[2][2];

        Cubie x_3_1 =BOX[3][0];      Cubie x_4_1 =BOX[4][0];
        Cubie x_3_2 =BOX[3][1];      Cubie x_4_2 =BOX[4][1];
        Cubie x_3_3 =BOX[3][2];      Cubie x_4_3 =BOX[4][2];

        //--------------------------------------------------

          BOX[1][0]=x_2_1;        BOX[2][0]=x_3_1;
          BOX[1][1]=x_2_2;        BOX[2][1]=x_3_2;
          BOX[1][2]=x_2_3;        BOX[2][2]=x_3_3;

          BOX[3][0]=x_4_1;        BOX[4][0]=x_1_1;
          BOX[3][1]=x_4_2;        BOX[4][1]=x_1_2;
          BOX[3][2]=x_4_3;        BOX[4][2]=x_1_3;        
        
    }
}
