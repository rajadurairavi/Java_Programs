package JavaPrograms;

public class OccurenceOfEachCharacters {

public static void main(String[] args) {
		
		String str = "Programms";
		for(int i=0;i<str.length();i++) {
			int count =0;
			
			//check if the character already exist or not
			if(str.indexOf(str.charAt(i))!=i)
			{
				continue;
			}
			for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			System.out.println(str.charAt(i)+" : "+count);
		}
		
		
		
	}
		

}
