import java.util.Scanner;

class Person {
	// Instance variables (data or "state")
	String name;
	String secondName;
	String lastName;

	int age;
	int kg;
	int cm;

	// Classes can contain
	// 1.Data
	// 2.Subroutines (methods)

	void speak() {
		System.out.println("I am the better one!");
	}

	void spit() {
		System.out.println("No,I am the better one!");
	}
}

class Dog {
	String nameDog;
	int ageDog;
	int kgDog;
	int cmDog;

	void bark() {
		System.out.println("I am a dog!");
	}

}

public class Methods {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int personGood = 2;
		int personBad = 1;

		Person better = new Person();
		better.name = "Dimitriy";
		better.secondName = "Ivanov";
		better.lastName = "Dimitrov";
		better.age = 26;
		better.kg = 82;
		better.cm = 176;
		better.speak();

		System.out.println(better.name + better.secondName + better.lastName + better.age + better.cm + better.kg);
		Person worst = new Person();
		worst.name = "Dimitriy";
		worst.secondName = "Ivanov";
		worst.lastName = "Dimitrov";
		worst.age = 22;
		worst.kg = 62;
		worst.cm = 176;
		worst.spit();

		if (personGood > personBad) {
			System.out.println("Keep on the good work");
		} else if (personBad > personGood)
			System.out.println("You should take care of yourself!");

		do {
			System.out.println("1 or 2");
			personGood = s.nextInt();

		} while (personGood != 2);
		System.out.println("Yes,Yes,Yes!!!");

	}

}
