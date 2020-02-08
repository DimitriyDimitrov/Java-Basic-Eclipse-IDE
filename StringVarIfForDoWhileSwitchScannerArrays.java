import java.util.Scanner;

public class StringVarIfForDoWhileSwitchScannerArrays {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Give a command");
		String text = s.nextLine();

		int value = 0;
		int first = 1;
		int second = 2;
		int third = 3;
		int fourth = 4;
		int fifth = 5;
		int calc = first + second + third + fourth;
		int lastOne = 11;

		switch (text) {
		case "start":
			System.out.println("The machine started!");
			break;
		case "stop":
			System.out.println("The machine stopped");
			break;
		case "pause":
			System.out.println("You paused the machine");
			break;
		default:
			System.out.println("Command not recognized!");
		}

		System.out.println("Give another command");
		String textOne = s.nextLine();

		switch (textOne) {
		case "start":
			System.out.println("The machine started!");
			break;
		case "stop":
			System.out.println("The machine stopped");
			break;
		case "pause":
			System.out.println("You paused the machine");
			break;
		default:
			System.out.println("Command not recognized!");
		}

		do {
			System.out.println("Find the perfect number");
			value = s.nextInt();
		}

		while (value != 5);
		System.out.println("This is the perfect number: " + fifth);

		if (first > second) {
			System.out.println("No chance!");
		} else if (second > third) {
			System.out.println("No way!");
		} else if (lastOne == calc + first)
			;
		System.out.println("Exactly,the perfect number: " + fifth);

		for (int fifth1 = 5; fifth1 < 10; fifth1++) {
			System.out.println("The value of i is: " + fifth1);
		}
		for (int b = 10; b < 50; b++)
			System.out.println("The value of b is: " + b);

		for (int fifth1 = 5; fifth1 < 10; fifth1++)
			;
		System.out.println("Between is: " + fifth);

		int[] someNumbers;
		someNumbers = new int[3];

		someNumbers[0] = 55;
		someNumbers[1] = 56;
		someNumbers[2] = 57;

		System.out.println(someNumbers[0]);
		System.out.println(someNumbers[1]);
		System.out.println(someNumbers[2]);

		int[] someNextNumbers = { 55, 56, 57, 58, 59 };
		int[] otherNumbers = { 1, 2, 3, 4, 5, };
		int[] lastNumbers = { 10, 20, 30, 40, 50 };

		for (int b = 0; b < someNextNumbers.length; b++) {
			System.out.println(someNextNumbers[b]);
		}
		for (int c = 0; c < otherNumbers.length; c++) {
			System.out.println(otherNumbers[c]);
		}
		for (int d = 0; d < lastNumbers.length; d++) {
			System.out.println(lastNumbers[d]);
		}
	}

}