import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Give a start / stop command!");
		String text = input.nextLine();
		int first = 1;
		int second = 2;
		int third = 3;
		int fourth = 4;
		int fifth = 5;
		int sixth = 6;
		int seventh = 7;
		int eight = 8;
		int ninght = 9;
		int tenth = 10;
		int numbers = first + second + third + fourth + fifth + sixth + seventh + eight + ninght + tenth;
		char myChar = '®';

		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;

		case "stop":
			System.out.println("Machine stopped!");
			break;
		case "pause":
			System.out.println("Machine paused!");
			break;
		default:
			System.out.println("Command not recognized!");
		}

		System.out.println(""); // New line,makes the code more readable !!!
		System.out.println("Give another command!");
		String textOne = input.nextLine();

		switch (textOne) {
		case "start":
			System.out.println("Machine startet!");
			break;

		case "stop":
			System.out.println("Machine stopped!");
			break;
		case "pause":
			System.out.println("Machine paused!");
			break;
		default:
			System.out.println("Command not recognized!");
		}

		System.out.println(""); // New line,makes the code more readable !!!

		for (int i = 0; i < 2; i++) {
			System.out.println("You gave two commands! ");
		}

		System.out.println(""); // New line,makes the code more readable !!!

		for (numbers = 55; numbers < 60; numbers++) {
			System.out.println("The value in this case of numbers is: " + numbers + myChar);
		}

		System.out.println(""); // New line,makes the code more readable !!!

		if (tenth > numbers && tenth == numbers) {
			System.out.println("What's going on with the math!");
		} else if (ninght > tenth) {
			System.out.println("Impossible calculation!");
		} else if (first + ninght == tenth) {
			System.out.println("Definitely this calculation!");
		}

		System.out.println(""); // New line,makes the code more readable !!!

		int[] numbersOne;
		numbersOne = new int[5];

		numbersOne[0] = 55;
		numbersOne[1] = 56;
		numbersOne[2] = 57;
		numbersOne[3] = 58;
		numbersOne[4] = 59;

		System.out.println(numbersOne[0]);
		System.out.println(numbersOne[1]);
		System.out.println(numbersOne[2]);
		System.out.println(numbersOne[3]);
		System.out.println(numbersOne[4]);

		System.out.println(""); // New line,makes the code more readable !!!

		int[] nextNumbers = { 55, 56, 57, 58, 59 };

		for (int b = 0; b < nextNumbers.length; b++) {
			System.out.println(nextNumbers[b]);
		}

		System.out.println(""); // New line,makes the code more readable !!!

		int value = 0;

		do {
			System.out.println("Find the correct number! !");

			value = input.nextInt();
		}

		while (value != 5);

		System.out.println("Congratulations!");
		
	}

}
