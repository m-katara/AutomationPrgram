package BasicJavaProgram;

public class Operators_StaticMethod 
{
	static void Addition() 
	{
		int a = 100;
		int b = 200;
		int sum = a+b;
		
		System.out.println("Sum of 2 numbers is " +sum);
	}
	static void Subtraction() 
	{
		int a = 100;
		int b = 200;
		int diff = b-a;
		
		System.out.println("Diff of 2 numbers is " +diff);
	}

	public static void main(String[] args) 
	{
		Addition();
		Subtraction();

	}

}
