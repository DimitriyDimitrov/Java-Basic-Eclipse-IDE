
public class JavaSpreadVarargs {

	public static void main(String[] args) {
		
		System.out.println(sum(10,20,30,40));
	}
	
	public static int sum(int...numbers) {
		int total = 0;
		for(int x:numbers)
			total+=x;
		return total / numbers.length;
	}
}
