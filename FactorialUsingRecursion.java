package JavaPrograms;

public class FactorialUsingRecursion {

		static int fact(int n){
			
			if(n==0) {
				
				return 1;
			}else {
				
				return n=n*fact(n-1);
			}
		
	}
	
	
	public static void main(String[] args) {
		int n=3;
		System.out.println(fact(n));
		
	}
	
	
	
	
	
	
	

}


