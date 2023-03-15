package BL.Rotation;
import BL.Cubie;

public class Up {

    public static void UpMovement(Cubie BOX[][]){ 
        
        Cubie x_0_1 =BOX[0][0];      Cubie x_1_1 =BOX[1][0];
        Cubie x_0_2 =BOX[0][1];      Cubie x_1_2 =BOX[1][1];
        Cubie x_0_3 =BOX[0][2];      Cubie x_1_3 =BOX[1][2];

        Cubie x_3_1 =BOX[3][0];      Cubie x_5_1 =BOX[5][0];
        Cubie x_3_2 =BOX[3][1];      Cubie x_5_2 =BOX[5][1];
        Cubie x_3_3 =BOX[3][2];      Cubie x_5_3 =BOX[5][2];

        //--------------------------------------------------

          BOX[0][0]=x_3_1;        BOX[1][0]=x_0_1;
          BOX[0][1]=x_3_2;        BOX[1][1]=x_0_2;
          BOX[0][2]=x_3_3;        BOX[1][2]=x_0_3;

          BOX[3][0]=x_5_1;        BOX[5][0]=x_1_1;
          BOX[3][1]=x_5_2;        BOX[5][1]=x_1_2;
          BOX[3][2]=x_5_3;        BOX[5][2]=x_1_3;        
        
    }
}
