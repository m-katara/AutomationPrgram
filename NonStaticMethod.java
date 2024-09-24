package BasicJavaProgram;

public class NonStaticMethod 
{
	void addition()
	{
		System.out.println("Adding 2 numbers");
	}
	void subtract()
	{
		System.out.println("Subtracting 2 numbers");
	}
	public static void main(String[] args) 
	{
		System.out.println("My main method");
		NonStaticMethod n1 = new NonStaticMethod();
		n1.addition();
		n1.subtract();
	
	}

}
