import java.util.Scanner;

public class KgCmAge {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your age: ");

		int kg;
		int cm;
		int age;

		age = s.nextInt();

		if (age > 30 || age == 30) {
			System.out.println("You are in the perfect age! ");
		} else if (age < 30) {
			System.out.println("You are under the age!");
		}

		System.out.println("Enter your weight: ");

		kg = s.nextInt();

		if (kg > 100 || kg == 100) {
			System.out.println("Over your weight!");
		} else if (kg < 100) {
			System.out.println("Keep on the good work!");
		}

		System.out.println("Enter your height: ");

		cm = s.nextInt();

		if (cm > 200 || cm == 200) {
			System.out.println("You are a GIANT person! ");
		} else if (cm < 200) {
			System.out.println("Just a normal height!");
		}
	}

}
