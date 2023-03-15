package BL;

import BL.Cubie;
import BL.Rotation.Back;
import BL.Rotation.Down;
import BL.Rotation.Front;
import BL.Rotation.Left;
import BL.Rotation.Right;
import BL.Rotation.Up;

public class Scamble {

    // The program will work fine if it makes >2 moves (but it will takes a lot of
    // time as bfs is used)
    // First make the cube as scamble 

    public static void makeRandonMoves(Cubie BOX[][]) {

        int min = 0;
        int max = 4;

        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
     
        if (random_int == 0) {
            Left.LeftMovement(BOX);
            Right.RightMovement(BOX);
        } else if (random_int == 1) {
            Back.BackMovement(BOX);
            Front.FrontMovement(BOX);
        } else if (random_int == 2) {
            Up.UpMovement(BOX);
            Left.LeftMovement(BOX);
        } else if (random_int == 3) {
            Right.RightMovement(BOX);
            Down.DownMovement(BOX);
        } else {
            Right.RightMovement(BOX);
            Left.LeftMovement(BOX);
        }
    }
}