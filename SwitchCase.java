import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Start/Stop ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped!");
			break;
		default:
			System.out.println("Command not recognized!");

		}

		System.out.println("Ask again ");
		String textOne = input.nextLine();
		switch (textOne) {
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped!");
			break;
		default:
			System.out.println("Command not recognized!");

		}
		System.out.println("Okay,Thats all");
		System.out.println("Bye");
		String textTwo = input.nextLine();

	}

}
