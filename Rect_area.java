package BasicJavaProgram;

import java.util.Scanner;

public class Rect_area 
{

	public static void main(String[] args) 
	{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter value of length");
			double length = s1.nextDouble();
			System.out.println("Enter value of breadth");
			double breadth = s1.nextDouble();
			double area = length*breadth;
			
			System.out.println("Area of rectangle is " + area);


	}

}
