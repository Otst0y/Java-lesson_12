package lesson_12_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rnd = new Random();
		ArrayList carList = new ArrayList();

		int randomYear = (int) (1950 + Math.random() * 73);
		int randomCylinders = (int) (4 + Math.random() * 8);
		double randomDiameter = 12 + Math.random() * 6.8;
		String randomMaterial = rnd.nextInt(3) == 2 ? "leather" : "polyurethane";

		SteeringWheel SW = new SteeringWheel(randomDiameter, randomMaterial);
		Engine engine = new Engine(randomCylinders);
		
		Car setCar = new Car(rnd.nextInt(401), randomYear, SW, engine);

		
		for(int i = 0; i <= 10; i++) {
			Car c = new Car(rnd.nextInt(401), randomYear, SW, engine);
			carList.add(c);
		}
		
			
		while (true) {
			System.out.println("Enter 1 to output deepToString of an element.");
			System.out.println("Enter 2 to fill ");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();

			switch (number) {
			case 1:
				System.out.println(carList);;
				break;
			case 2:
				Collections.fill(carList, setCar);
				System.out.println(carList);
				break;
			}
		}

	}

}
