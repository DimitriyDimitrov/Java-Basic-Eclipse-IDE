
public class ArraysOfString {

	public static void main(String[] args) {
		String[] words = new String[5];
		
		words = new String[5];
		words[0] = "D";
		words[1] = "I";
		words[2] = "D";
		words[3] = "2";
		words[4] = "6";
		
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		System.out.println(words[3]);
		System.out.println(words[4]);
		
		String[] did = {"D, I, D"};
		
		for(String fruit: did) {
			System.out.println(fruit);
		}
		
		int value = 26;
		
		String text = null;
		
		System.out.println(text);
		
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		
		texts[0] = "one";
	}

}
