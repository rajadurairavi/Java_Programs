package JavaPrograms;

public class UpperLowerSpecialDigitsOfGivenString {

	public static void main(String[] args) {
		
		String given = "RajaDurai@&#1234";
		char[] ch = 	given.toCharArray();
		int up = 0;int lc = 0;int sc = 0;int dg = 0;
		String UP ="";String LC ="";String SC ="";String DG ="";
		
		for(char c:ch) {
			
			if(Character.isUpperCase(c)) {
				up++;
				UP = UP+c;
			}else if(Character.isLowerCase(c)) {
				LC = LC+c;
				lc++;
			}else if(Character.isDigit(c)) {
				dg++;
				DG = DG+c;
			}else {
				sc++;
				SC = SC+c;
			}
		}
		
		System.out.println(up+" "+lc+" "+sc+" "+dg);
		System.out.println(UP+" "+LC+" "+SC+" "+DG);
		
		
	}

}
