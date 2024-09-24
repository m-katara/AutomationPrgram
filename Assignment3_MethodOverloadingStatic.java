package BasicJavaProgram;

public class Assignment3_MethodOverloadingStatic 
{
	static void addition(double a, double b)
	{
		 double sum = a+b;
		System.out.println(sum);
	}
	
	static void subtraction(int a, int b)
	{
		int diff = a-b;
		System.out.println(diff);
	}
	
	static void multiply(int a, double b)
	{
		double product = a*b;
		System.out.println(product);
	}
	public static void main(String[] args) 
	{
		addition(32.9, 25.7);
		subtraction(55, 45);
		multiply(5, 6.5);

	}

}
