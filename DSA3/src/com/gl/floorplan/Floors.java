package com.gl.floorplan;

import java.util.ArrayList;
import java.util.Scanner;

public class Floors {
	int totalFloors;
	ArrayList<Integer> floors = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Floors building = new Floors();
		Floorplan plan = new Floorplan();

		System.out.println("enter the total no of floors in the building");
		building.totalFloors = sc.nextInt();

		for (int i = 0; i < building.totalFloors; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			int floorSize = sc.nextInt();
			if (building.floors.contains(floorSize) || floorSize < 1 || floorSize > building.totalFloors) {
				System.out.println("invalid floor size - please enter again");
				i--;
			} else {
				building.floors.add(floorSize);
			}
		}

		plan.constructionOrder(building.totalFloors, building.floors);

		sc.close();
	}
}