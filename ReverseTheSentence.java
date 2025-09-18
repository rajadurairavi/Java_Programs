package JavaPrograms;

public class ReverseTheSentence {
	
	public static void main(String[] args) {
		
		String str = "Raja is Intelligent";
		String[] original = 	str.split(" ");
		String reverse = " ";
		
		for(int i = original.length-1;i>=0;i--) {
			
			reverse = reverse+original[i]+" ";
		}
		
		System.out.println(reverse);
	}

}
