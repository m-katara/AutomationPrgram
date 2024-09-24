package BasicJavaProgram;

public class Assignment2 
{
	 void Addition() 
	{
		int a = 100;
		int b = 200;
		int sum = a+b;
		
		System.out.println("Sum of 2 numbers is " +sum);
	}
	 void Subtraction() 
	{
		int a = 100;
		int b = 200;
		int diff = b-a;
		
		System.out.println("Diff of 2 numbers is " +diff);
	}

	public static void main(String[] args) 
	{
		Assignment2 o1 = new Assignment2();
		o1.Addition();
		o1.Subtraction();

	}

}
