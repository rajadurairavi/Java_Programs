package JavaPrograms;

public class PrintVowels {

	public static void main(String[] args) {


		String str = "Ashuthosh";
		int count = 0;
		String name = 	str.toLowerCase();
		char[] ch = 	name.toCharArray();

		for(char c :ch) {

			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
				System.out.print(c);
			}


		}
		System.out.println(count);

	}

}
