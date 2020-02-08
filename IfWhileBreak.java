
public class IfWhileBreak {

	public static void main(String[] args) {
		
		int loop = 0;
		int nextLoop = 1;
		
		while (loop < 5) {
			System.out.println("Looping: " );
			
			if(nextLoop > 5) {
				System.out.println("Running: ");
			}
			
			else if(nextLoop == 1)
					System.out.println("Finished: " + nextLoop);
				break;
				
		}
	}

}
