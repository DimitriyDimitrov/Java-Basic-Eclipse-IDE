import java.util.Scanner; 

public class JavaException {

	public static void main(String[] args) { 

		Scanner s = new Scanner(System.in);
		int i = 1;
		
		do {
		try {
		System.out.println("Enter your first number: ");
		int n1;
		n1 = s.nextInt();
		
		System.out.println("Enter your second number: ");
		int n2;
		n2 = s.nextInt();
		
		int sum = n1/n2;
		System.out.println(sum);
		i = 1;
		}catch(Exception e) {
			System.out.println("You can't divide by 0 ");
		}
		
		}while(i==1);
	}

}