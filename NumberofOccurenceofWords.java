package JavaPrograms;

public class NumberofOccurenceofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =  
			"Java is a programming language. Java is widely used in software Testing";
		
		String[] words = 	str.toLowerCase().split(" ");
		String input = "java";
		int count = 0;
		
		for(String word:words) {
			
			if(word.equals(input)) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
