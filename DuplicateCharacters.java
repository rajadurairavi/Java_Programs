package JavaPrograms;

import java.util.HashSet;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		
		String str = "appleee is fruit";
		String input = 	str.replace(" ", "");
		char[] ch = 	input.toCharArray();
		HashSet<Character> printed = new HashSet<>();
		
		for(int i=0;i<input.length();i++) {
			for(int j =i+1;j<input.length();j++) {
				
				if(ch[i]==ch[j] && !printed.contains(ch[i])) {
					System.out.println(ch[j]);
					printed.add(ch[i]);
				}
			}
		}
		
		
//		String a = "Rajadurai Ravi";
//		String str = 	a.toLowerCase().replace(" ", "");
//		char[] ch = 	str.toCharArray();
//		HashSet<Character> printed = new HashSet<>();
//		
//		for(int i=0;i<str.length();i++) {
//			for(int j=i+1;j<str.length();j++){
//				
//				if(ch[i]==ch[j] && !printed.contains(ch[i])) {
//					System.out.println(ch[i]);
//					printed.add(ch[i]);
//					
//				}
//			}
//		}
		
		
	}

}
