package JavaPrograms;

import java.util.Arrays;

public class AnagramWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = " Listen";
		String s2 = " Silent";
		
		String S1 = 	s1.toLowerCase();
		String S2 = 	s2.toLowerCase();
		
		char[] word1= 	S1.toCharArray();
		char[] word2 = 	S2.toCharArray();
		
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		if (Arrays.equals(word1, word2)) {
			
			System.out.println("The given word is Anagram");
			
		}
		
		else {
			System.out.println("The given word isnot  Anagram");
		}
	}

}
