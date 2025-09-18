package JavaPrograms;

public class TwoNumbersEqualsTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = {2,4,6,8,10}; //which 2 index is equal to target value
		int target = 10;
		
		for(int i =0;i<num.length;i++) {
			for(int j = i+1;j<num.length;j++) {
				
				if(num[i]+num[j] == target) {
					System.out.println(i + " and " + j);
					return;
				}
				
			}
		}

	}

}
