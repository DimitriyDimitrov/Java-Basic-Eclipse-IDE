import java.util.Scanner;

public class MyExampleOneSpread {

	public static void main(String[] args) {
		System.out.println(all(10, 20));
		System.out.println(fact(5));

		Scanner s = new Scanner(System.in);
		int i = 1;

		do {
			try {
				System.out.println("Enter your first number: ");
				int n1;
				n1 = s.nextInt();
				System.out.println("Enter your seccond number: ");
				int n2;
				n2 = s.nextInt();
				int sum = n1 / n2;
				System.out.println(sum);
				i = 1;
			} catch (Exception e) {
				System.out.println("You can't divide by 0");
			}

		} while (i == 1);
	}

	public static int all(int... numbers) {
		int total = 0;
		for (int x : numbers)
			total += x;
		return total / numbers.length;
	}
	public static int fact(int n) {
		if (n <= 1)
			return 1;
		else
			return n * fact(-1);
	}

}
