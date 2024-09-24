package BasicJavaProgram;

public class Assignment4_MethodoverloadNonstatic 
{
	void addition(double a, double b)
	{
		 double sum = a+b;
		System.out.println(sum);
	}
	
	 void subtraction(int a, int b)
	{
		int diff = a-b;
		System.out.println(diff);
	}
	
	void multiply(int a, double b)
	{
		double product = a*b;
		System.out.println(product);
	}
	
	void division(int a, double b)
	{
		double div = a/b;
		System.out.println(div);
	}

	public static void main(String[] args) 
	{
		Assignment4_MethodoverloadNonstatic m1 = new Assignment4_MethodoverloadNonstatic();
		m1.addition(32.9, 25.7);
		m1.subtraction(55, 45);
		m1.multiply(5, 6.5);
		m1.division(44, 7.2);

	}

}
