package main;

import java.util.concurrent.TimeUnit;
import BL.*;
import UI.*;

public class main {

	public static void main(String[] args) {

		Cubie[][] BOX = SetDefault.Make_Cube();
		SetDefault.Initialize_Cube(BOX);

		System.out.println("\nScamble Cube is :");

		Scamble.makeRandonMoves(BOX);
		
		PrintCube.PrintCube(BOX);

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		BFS.BFS(BOX);

	}
}
