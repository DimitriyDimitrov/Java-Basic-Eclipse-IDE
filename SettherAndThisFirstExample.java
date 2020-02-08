class Person {
	String name;
	String behaviour;
	int age;
	int kg;
	int cm;

	public void setName(String name) {
		this.name = name;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public void setCm(int cm) {
		this.cm = cm;
	}

	public String getName() {
		return name;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public int getAge() {
		return age;
	}

	public int getKg() {
		return kg;
	}

	public int getCm() {
		return cm;
	}
}

class Human {
	String namef;
	String behaviourf;
	int agef;
	int kgf;
	int cmf;

	public void setNamef(String namef) {
		this.namef = namef;
	}

	public void setBehaviourf(String behaviourf) {
		this.behaviourf = behaviourf;
	}

	public void setAgef(int agef) {
		this.agef = agef;
	}

	public void setKgf(int kgf) {
		this.kgf = kgf;
	}

	public void setCmf(int cmf) {
		this.cmf = cmf;
	}

	public String getNamef() {
		return namef;
	}

	public String getBehaviourf() {
		return behaviourf;
	}

	public int getAgef() {
		return agef;
	}

	public int getKgf() {
		return kgf;
	}

	public int getCmf() {
		return cmf;
	}
}

class Animal {
	String name;
	String behaviour;
	String breed;
	int age;
	int kg;
	int cm;

	public void setInfo(String name, String behaviour, String breed, int age, int kg, int cm) {
		this.name = name;
		this.behaviour = behaviour;
		this.breed = breed;
		this.age = age;
		this.kg = kg;
		this.cm = cm;
	}

	public String getName() {
		return name;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public int getKg() {
		return kg;
	}

	public int getCm() {
		return cm;
	}
}

class City {
	String namec;
	String provincec;
	int populationc;
	int levelc;

	public void SetInfoC(String namec, String provincec, int populationc, int levec) {
		this.namec = namec;
		this.provincec = provincec;
		this.populationc = populationc;
		this.levelc = levec;
	}

	public String getNamec() {
		return namec;
	}

	public String getProvincec() {
		return provincec;
	}

	public int getPopulationc() {
		return populationc;
	}

	public int getLevelc() {
		return levelc;
	}
}

public class SettherAndThisFirstExample {

	public static void main(String[] args) {

		Person person1 = new Person();

		person1.setName("Mitko");
		person1.setBehaviour("Calm");
		person1.setAge(26);
		person1.setKg(82);
		person1.setCm(177);

		System.out.println("name " + person1.getName());
		System.out.println("attitude " + person1.getBehaviour());
		System.out.println("years " + person1.getAge());
		System.out.println("weight " + person1.getKg());
		System.out.println("height " + person1.getCm());

		// the end of Person1
		System.out.println(); // new line

		Human human1 = new Human();

		human1.setNamef("Nasko");
		human1.setBehaviourf("Energetic");
		human1.setAgef(30);
		human1.setKgf(74);
		human1.setCmf(174);

		System.out.println("name " + human1.getNamef());
		System.out.println("attitude " + human1.getBehaviourf());
		System.out.println("years " + human1.getAgef());
		System.out.println("weight " + human1.getKgf());
		System.out.println("height " + human1.getCmf());

		// the end of Human1
		System.out.println();

		Animal animal1 = new Animal();

		String name = "Roki";
		String behaviour = "Nice";
		String breed = "Dog";
		int age = 3;
		int kg = 8;
		int cm = 24;

		animal1.setInfo(name, behaviour, breed, age, kg, cm);

		System.out.println("name " + animal1.getName());
		System.out.println("attitude " + animal1.getBehaviour());
		System.out.println("species " + animal1.getBreed());
		System.out.println("years " + animal1.getAge());
		System.out.println("weight " + animal1.getKg());
		System.out.println("height " + animal1.getCm());

		// the end of Animal1
		System.out.println();

		City city1 = new City();

		String namec = "Haskovo";
		String provincec = "Haskovo";
		int populationc = 55000;
		int levelc = 203;

		city1.SetInfoC(namec, provincec, populationc, levelc);

		System.out.println("city " + city1.getNamec());
		System.out.println("province " + city1.getProvincec());
		System.out.println("population " + city1.getPopulationc());
		System.out.println("sea level " + city1.getLevelc());

		// the end of City1

	}

}
