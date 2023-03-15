package BL;

import java.util.LinkedList;
import java.util.Queue;

import BL.Rotation.Back;
import BL.Rotation.Down;
import BL.Rotation.Front;
import BL.Rotation.Left;
import BL.Rotation.Right;
import BL.Rotation.Up;
import UI.PrintCube;

public class BFS {

    public static void BFS(Cubie BOX[][])

    {
        Queue q = new LinkedList();

        LinkedList<String> visited = new LinkedList<String>();

        q.add(BOX);

        boolean breaker = false;

        while (!q.isEmpty() && breaker != true) {

            Cubie[][] nextNode = (Cubie[][]) q.remove();

            PrintCube.PrintCube(nextNode);

            if (SetDefault.Check_if_equals(nextNode)) {
                breaker = true;
            } else {
            }

            if (breaker != true) {
                String s = SetDefault.to_String(nextNode);
                if (!visited.contains(s)) {
                    visited.add(s);

                    Cubie[][] LeftBox = SetDefault.Make_Cube();
                    Cubie[][] RightBox = SetDefault.Make_Cube();

                    Cubie[][] UpBox = SetDefault.Make_Cube();
                    Cubie[][] DownBox = SetDefault.Make_Cube();

                    Cubie[][] FrontBox = SetDefault.Make_Cube();
                    Cubie[][] BackBox = SetDefault.Make_Cube();

                    SetDefault.Copy(LeftBox, nextNode);
                    SetDefault.Copy(RightBox, nextNode);

                    SetDefault.Copy(UpBox, nextNode);
                    SetDefault.Copy(DownBox, nextNode);

                    SetDefault.Copy(FrontBox, nextNode);
                    SetDefault.Copy(BackBox, nextNode);

                    Left.LeftMovement(LeftBox);
                    Right.RightMovement(RightBox);

                    Up.UpMovement(UpBox);
                    Down.DownMovement(DownBox);

                    Front.FrontMovement(FrontBox);
                    Back.BackMovement(BackBox);

                    String l = SetDefault.to_String(LeftBox);
                    String R = SetDefault.to_String(RightBox);

                    String U = SetDefault.to_String(UpBox);
                    String D = SetDefault.to_String(DownBox);

                    String F = SetDefault.to_String(FrontBox);
                    String B = SetDefault.to_String(BackBox);

                    if (!visited.contains(l)) {
                        q.add(LeftBox);
                    } else {
                    }

                    if (!visited.contains(R)) {
                        q.add(RightBox);
                    } else {
                    }

                    if (!visited.contains(U)) {
                        q.add(UpBox);
                    } else {
                    }

                    if (!visited.contains(D)) {
                        q.add(DownBox);
                    } else {
                    }

                    if (!visited.contains(F)) {
                        q.add(FrontBox);
                    } else {
                    }

                    if (!visited.contains(B)) {
                        q.add(BackBox);
                    } else {
                    }

                } else {
                    System.out.println("\nDiscard Visited\n");
                }

            } else {
                System.out.println("\nWOW Solved!");
            }
        }

    }
}
