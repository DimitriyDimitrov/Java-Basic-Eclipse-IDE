
public class Arrays {

	public static void main(String[] args) {

		int[] numbers;
		numbers = new int[7];

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		numbers[5] = 60;
		numbers[6] = 70;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);

		int[] nextNumbers = { 100, 200, 300, 400, 500, 600, 700 };

		System.out.println("This is your next line!");

		for (int i = 0; i < nextNumbers.length; i++) {
			System.out.println(nextNumbers[i]);
		}

	}

}
