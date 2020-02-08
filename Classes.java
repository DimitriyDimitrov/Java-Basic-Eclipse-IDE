
class Person {
	// Instance variables (data or "state")
	String name;
	int age;
	int kg;
	int cm;
	
	
	// Classes can contain
	// 1.Data
	// 2.Subroutines (methods)
}
public class Classes {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 26;
		person1.kg = 65;
		person1.cm = 178;
		
		
		Person person2 = new Person();
		person2.name = "Will";
		person2.age = 29;
		person2.kg = 78;
		person2.cm = 180;
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.kg);
		System.out.println(person1.cm);
		
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.kg);
		System.out.println(person2.cm);
		
	}

}
