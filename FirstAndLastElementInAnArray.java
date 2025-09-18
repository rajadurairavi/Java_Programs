package JavaPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class FirstAndLastElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] given = {3,5,7,9,2,45,53,12,56};
		
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(given));
		
		int first = 		input.get(0);
		int last = 			input.get(input.size()-1);
		
		
		System.out.println(first );
		System.out.println(last );
		
		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(given));
		
		System.out.println(ts.getFirst());
		System.out.println(ts.getLast());
		
		
		

	}

}
