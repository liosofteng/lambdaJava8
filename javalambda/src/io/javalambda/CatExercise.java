package io.javalambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatExercise {

	public static void main(String[] args) {
		
		List<Cat> cats = Arrays.asList(
					new Cat("Kryton", 5),
					new Cat("Stanley", 3),
					new Cat("Black", 1),
					new Cat("Kevin", 1),
					new Cat("Kattie", 2)
				);
	
	
		//step 1: sort list by last name
		//implementing comparison by using a lambda implementation
		Collections.sort(cats, (Cat c1, Cat c2) -> c1.getName().compareTo(c2.getName()));		
		
		//step 2: create a method that prints all elements in the list
		System.out.println("Printing all cats!");
		printConditionally(cats, c -> true);
		
		//step 3: create a method that prints all people that have last name begging with K
		System.out.println("Printing all cats with the name beginning with K");
		
		printConditionally(cats, c -> c.getName().startsWith("K"));
	
	}
	
	//printing conditionally
	private static void printConditionally(List<Cat> cats, Condition condition) {
		for (Cat c : cats) {
			if (condition.test(c)) {
				System.out.println(c);
			}
		}
	}
	
}

//condition interface
interface Condition {
	boolean test(Cat c);
}

