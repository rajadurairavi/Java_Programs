package JavaPrograms;

public class StringPrograms {

	public static void main(String[] args) {
		
		
		System.out.println("***********************************************");
		
		/*
		 * input : "raja-king" and 
		 * output : 
		 *         [raja] 
		 *         [king]
		 */
		
		String a = "raja-king";
		String[] parts = 	a.split("-");
		System.out.println("[ "+ parts[0]+" ]");
		System.out.println("[ "+ parts[1]+" ]");
		
		System.out.println("***********************************************");
		
		/*
		 * input : "welcome to java world" 
		 * output : 
		 *         welcome
		 *         to
		 *         java
		 *         world
		 *         
		 */
		
		String s = "welcome to java world";
		String[] words = 	s.split(" ");
		for(String word : words) {
			
			System.out.println(word);
		}
		
		System.out.println("***********************************************");
		/*
		 * input : "raja@gmail.com"
		 * output : 
		 *         Username : raja
		 *         Domain : gmail.com    
		 */
		
		String email = "raja@gmail.com";
		String[] emailsplit = 	email.split("@");
		System.out.println("Username: "+emailsplit[0]);
		System.out.println("Domain: "+emailsplit[1]);

		System.out.println("***********************************************");
	
		/*
		 * input : "name:raja,age:25;city:chennai" 
		 * Output : 
		 * 		name:raja 
		 * 		age:25
		 *		city:chennai
		 */
		
		String data = "name:raja,age:25;city:chennai";
		String[] data1 = 	data.split("[,;]");
		for(String data2 : data1) {
			System.out.println(data2);
		}
	
		System.out.println("***********************************************");
		
		/*
		 * input : "Ra!j@a#123&%$" 
		 * Output : Raja123
		 */
		
		String clean = "Ra!j@a#123&%$";
		String cleaned = 	clean.replaceAll("[!@#&%$]", "");
		System.out.println(cleaned);
		System.out.println("***********************************************");
		/*
		 * input : "Java is super easy" 
		 * Output : words count is : 4
		 */
		
		String wc = "Java is super easy" ;
		String[] wcs = 	wc.split(" ");
		System.out.println(wcs.length);
		System.out.println("***********************************************");
}}
