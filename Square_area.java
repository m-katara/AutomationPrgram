package BasicJavaProgram;

import java.util.Scanner;

public class Square_area 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of Side");
		double side = s1.nextDouble();
		
		double area = side*side;
		
		System.out.println("Area of square is " + area);

	}
}
