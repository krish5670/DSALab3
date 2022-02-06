package com.gl.floorplan;

import java.util.ArrayList;
import java.util.Scanner;

public class Floorplan {

	public void constructionOrder(int totalFloors, ArrayList<Integer> floors) {
			int nextFloorToBuild = totalFloors;
			ArrayList<Integer> readyFloors = new ArrayList<Integer>();

			System.out.println("The order of construction is as follows");

			for (int i = 0; i < totalFloors; i++) {
				System.out.println("Day: " + (i + 1));

				int floor = floors.get(i);
				readyFloors.add(floor);

				if (floor == nextFloorToBuild) {
					while (readyFloors.contains(nextFloorToBuild)) {
						System.out.print(nextFloorToBuild-- + " ");
					}
				}

				System.out.println();
			}
		}
	}

