package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Numbers
		
		Integer[] array1 = {5,10,15,20,25};
		Integer[] array2 = {10,20,30,40,50};
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(array1));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(array2));
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		
		//Strings
		
		String[] array3 = { "Java", "JavaScript", "C", "C++"};
		String[] array4 = { "Python", "C#", "Java", "C++" };
		
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(array3));
		ArrayList<String> list4 = new ArrayList<>(Arrays.asList(array4));
		
	
		List<String> common = 	
				list3.stream().filter(list4::contains).collect(Collectors.toList());
		
		System.out.println(common);
		
		


	}

}