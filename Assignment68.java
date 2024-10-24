package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment68 
{
	public static void main(String[] args) {

		ArrayList S1 = new ArrayList();

		S1.add("Mayur");
		S1.add("Vishal");
		S1.add("Pranshul");
		S1.add("Kamesh");
		S1.add("Rishab");
		// S1.add(61);
		System.out.println(S1);

		Collections.sort(S1); // Sorting Arraylist

		System.out.println(S1);
	}

}
