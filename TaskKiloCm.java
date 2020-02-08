import java.util.Scanner;

public class TaskKiloCm {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your weight!");
		int kg;
		kg = s.nextInt();

		if (kg > 50 && kg < 70) {
			System.out.println("You are healthy!");
		} else {
			System.out.println("You need a doctor!");
		}

		System.out.println(); // new Line

		System.out.println("Enter your height!");

		int cm;
		cm = s.nextInt();

		if (cm > 150 && cm < 170) {
			System.out.println("You are okay!");
		} else {
			System.out.println("You are not okay,and you need a doctor!");
		}

	}

}
