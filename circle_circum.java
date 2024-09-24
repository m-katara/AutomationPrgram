package BasicJavaProgram;

import java.util.Scanner;

public class circle_circum 
{
	public static void main(String[] args) 
	{
		int a=2;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of pi");
		double pi = s1.nextDouble();
		System.out.println("Enter value of radius");
		double r = s1.nextDouble();
		double circumference = a*pi*r;
		
		System.out.println("circumference of circle is " + circumference);	
	}

}
