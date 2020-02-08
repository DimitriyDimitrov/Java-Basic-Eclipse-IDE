import java.util.Scanner;

public class PriceForUser {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a desire price for a kilos of apples!");
		int apples = 3; // 1kg., apples = 3lv;
		String kilos = "The price for one kg., is" + " " + apples + "lv.";
		apples = s.nextInt();

		if (apples > 3) {
			System.out.println("Its'not good for you! ");
		} else if (apples < 3) {
			System.out.println("You can buy it! ");
		} else if (apples == 3) {
			System.out.println("It's okay,that's the normal price for a kilos of apples! ");
		}

		System.out.println(""); // Next line,makes the code more readable!

		System.out.println("Suggest price again!");
		int next = 3; // 1kg., apples = 3lv;
		String nextKilos = "The price for one kg., is" + " " + apples + "lv.";
		next = s.nextInt();

		if (next > 3) {
			System.out.println("Its'not good for you! ");
		} else if (next < 3) {
			System.out.println("You can buy it! ");
		} else if (next == 3) {
			System.out.println("It's okay,that's the normal price for a kilos of apples! ");
		}

		System.out.println(""); // Next line,makes the code more readable!

		System.out.println("Enter your price for kg., of grape! ");
		int kgGrape = 5; // 1 kg., of grape = 5lv;
		String grapeKilo = "The price for one kg., grape is " + " " + kgGrape + "lv.";
		kgGrape = s.nextInt();

		if (kgGrape <= 5 && kgGrape == 5) {
			System.out.println("Yes,you can buy it! ");
		} else if (kgGrape > 5) {
			System.out.println("Give me another offer! ");
		}

		System.out.println(""); // Next line,makes the code more readable!

		System.out.println("Price for both of them! ");
		int lastOffer = 7; // The price for both products;
		lastOffer = s.nextInt();

		if (lastOffer < 7 || lastOffer == 7) {
			System.out.println("Yes, I take both products! ");
		} else if (lastOffer > 7) {
			System.out.println("Give me another offer! ");
		}

	}

}
