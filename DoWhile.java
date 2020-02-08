import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int value = 0;

		do {
			System.out.println("Type your password: ");

			value = s.nextInt();
		}

		while (value != 5);

		System.out.println("You entered the password");

	}

}
