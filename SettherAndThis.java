class Frog {
	public String name;
	public int age;
	public String calc;
	public int jump;

	public void setName(String name) {
		this.name = name;
	}

	public void setCalc(String calc) {
		this.calc = calc;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;

	}

	public String getCalc() {
		return calc;
	}

	public int getJump() {
		return jump;
	}

}

class Tiger {
	public String nameOne;
	public int kg;
	public int cm;
	public int ageOne;

	public void setNameOne(String nameOne) {
		this.nameOne = nameOne;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public void setCm(int cm) {
		this.cm = cm;
	}

	public void setAgeOne(int ageOne) {
		this.ageOne = ageOne;
	}

	public String getNameOne() {
		return nameOne;
	}
	
	public int getKg() {
		return kg;
	}	
	public int getCm() {
		return cm;
	}
	public int getAgeOne() {
		return ageOne;
	}
}
class Cat {
	public String nameTwo;
	public int ageTwo;
	public int kgTwo;
	public int cmTwo;
	
	public void setNameTwo(String nameTwo) {
		this.nameTwo = nameTwo;
	}
	public void setKgTwo(int kgTwo) {
		this.kgTwo = kgTwo;
	}
	public void setCmTwo(int cmTwo) {
		this.cmTwo = cmTwo;
	}
	
	public String getNameTwo() {
		return nameTwo;
	}
	public int getKgTwo() {
		return kgTwo;
	}
	public int getCmTwo() {
		return cmTwo;
	}
		
	}

public class SettherAndThis {

	public static void main(String[] args) {

		Frog frog1 = new Frog();

		// frog1.name = "Jo"; // Reffers to private
		// frgo1.age = 1; // Reffers to private

		frog1.setName("Jo");
		frog1.setAge(1);
		frog1.setCalc("Smile");
		frog1.setJump(10);

		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		System.out.println(frog1.getCalc());
		System.out.println(frog1.getJump());
		
		Tiger tiger1 = new Tiger();
		
		tiger1.setNameOne("Rio");
		tiger1.setKg(100);
		tiger1.setCm(205);
		tiger1.setAgeOne(10);
		
		System.out.println(tiger1.getNameOne());
		System.out.println(tiger1.getKg());
		System.out.println(tiger1.getCm());
		System.out.println(tiger1.getAgeOne());
		
		Cat cat1 = new Cat();
		
		cat1.setNameTwo("Roci");
		cat1.setCmTwo(23);
		cat1.setKgTwo(7);

		
		System.out.println(cat1.getNameTwo());
		System.out.println(cat1.getCmTwo());
		System.out.println(cat1.getKgTwo());
		
	}

}
