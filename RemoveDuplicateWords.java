package JavaPrograms;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "java sql java python java python";
		
		String[] OS = 	str.split(" ");
		
		String result = "";
		
		for(String s : OS) {
			
			if(!result.contains(s)) {
				
				result = result+s+" ";
			}
			
		}
		
		System.out.println(result);

	}

}
