package BasicJavaProgram;

import java.util.Scanner;

public class triangle_area 
{
	public static void main(String[] args) 
	{
		double a = 1/2;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of base");
		double base = s1.nextDouble();
		System.out.println("Enter value of height");
		double height = s1.nextDouble();
		double area = a*base*height;
		
		System.out.println("Area of triangle is " + area);

}
}
