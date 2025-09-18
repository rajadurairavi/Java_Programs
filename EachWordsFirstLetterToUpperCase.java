package JavaPrograms;

public class EachWordsFirstLetterToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java is fun macha";
		String[] gs = 	str.split(" ");
		String result = "";
		
		for(String s : gs) {
			
			result = result+s.substring(0,1).toUpperCase()+s.substring(1)+" ";
			
		}
		
		System.out.println(result);
	}

}
