package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> num = new ArrayList<>();
		
		num.add(20);
		num.add(10);
		num.add(0);
		num.add(40);
		
		System.out.println(num);
		num.set(0, 0); //Edit
		System.out.println(num);
		num.add(30); //Add
		System.out.println(num);
		num.remove(0); //Delete
		System.out.println(num);
		System.out.println(num.contains(15)); // is Exist
		
		
		System.out.println("Before Sorting : " + num);
		Collections.sort(num);
		System.out.println("After Sorting : " + num);
		Collections.sort(num.reversed());
		System.out.println("Reverse Sorting : " + num);
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Raja");
		names.add("Pooja");
		names.add("Roja");
		
		System.out.println(names);
		
		
		
		
	}

}
