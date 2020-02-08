class Person {
	String name;
	int age;
	int cm;
	int kg;

	void speak() {
		System.out.println("My name is: " + name);
	}

	int calculateYearsToRetirement() {
		int yearsLeft = 40 - age;
		return yearsLeft;
	}
	int yearsToRich() {
		int yearsToRichLeft = 30 - age;
		return yearsToRichLeft;
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}

	int getCm() {
		return cm;
	}

	int getKg() {
		return kg;
	}
}

public class GettersAndReturnValues {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "DD";
		person1.age = 26;
		person1.cm = 176;
		person1.kg = 82;

		int years = person1.calculateYearsToRetirement();
		int yearsOne = person1.yearsToRich();

		System.out.println("Years to retirement " + years);
		System.out.println("Years to rich " + yearsOne);
		System.out.println("I am " + person1.cm + " " + "height" + " " + "and" + " " + person1.kg + "kg");

		int age = person1.getAge();
		String name = person1.getName();
		int cm = person1.getCm();
		int kg = person1.getKg();

	}

}
