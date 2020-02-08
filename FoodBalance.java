import java.util.Scanner;

public class FoodBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How many meals you did today!");
		Scanner s = new Scanner(System.in);

		String meals = s.nextLine();
		int mealsInt = Integer.parseInt(meals);

		System.out.println("meals: " + meals);

		System.out.println("mealsInt: " + mealsInt);
		int[] m = new int[mealsInt];

		for (int i = 0; i < mealsInt; i++) {
			System.out.println("Enter calories for meal: " + i);

			int value = s.nextInt();
			m[i] = value;
		}

		int totalCalories = 0;

		for (int i = 0; i < mealsInt; i++) {

			totalCalories = totalCalories + m[i];
		}

		System.out.println("Totalcalories: " + totalCalories);
	}

}
