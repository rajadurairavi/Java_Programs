package JavaPrograms;
public class SecondLargestAndLowest {


		public static void main(String[] args) {
			
			
			//int[] a = {4,2,6,8,5,9};
			
			// print second largest and second lowest value 	
		
			// First method
//			Arrays.sort(a);
//			
//			System.out.println(Arrays.toString(a));
//			
//			int Secondhighest = a[1];
//			int secondLowest = a[a.length-2];
//			
//			System.out.println(secondLowest+ "&"+ Secondhighest );
			
			//Second method 
			
			
		

			int[] a = {5,4,1,2,5,7,9,11};
			
			int max = a[0];
			int min = a[0];
			for(int num:a) {
				
				if(num>max) {
					max = num;
				}else if(num<min) {
					min = num;
				}
			}
			
			int secondmax = a[0];
			int secondmin = a[0];
			
			for(int num:a) {
				
				if(num>secondmax && num <max) {
					secondmax = num;
				}else if(num<secondmin && num >min) {
					secondmin = num;
				}
				
				
			}
			
				
			System.out.println(max);
			System.out.println(min);
			System.out.println(secondmax);
			System.out.println(secondmin);	
			
		}
}
