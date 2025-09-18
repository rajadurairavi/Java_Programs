package JavaPrograms;

public class OddNumbers1_100 {
	
	public static void main(String[] args) {
		
		
		// print odd numbers b/w 0 to 100

		int n=100;
		int sum = 0;
		
		for(int i =1; i<=n;i++) {
			
			if(i%2==1) {
				
				System.out.println("odd numbers are "+i);
				sum = sum+ i;
				
			}
			
		}
		System.out.println(sum);
	}

}
