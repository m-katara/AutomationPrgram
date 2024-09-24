package BasicJavaProgram;

import java.util.Scanner;

public class Circle_area {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of pi");
		double pi = s1.nextDouble();
		System.out.println("Enter value of radius");
		double r = s1.nextDouble();
		double area = pi*r*r;
		
		System.out.println("Area of circle is " + area);
		
		

	}

}
