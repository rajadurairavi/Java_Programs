package JavaPrograms;

import java.util.TreeSet;

public class RemoveDuplicateNumberAndSortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {55, 39, 26, 78, 55, 99, 30};
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		for(int num : a) {
			
			ts.add(num);
		}

		System.out.println(ts);
	}

}
