package BasicJavaProgram;

public class Static_and_Nonstatic 
{
	void addition()
	{
		System.out.println("Adding 2 numbers");
	}
	static void subtract()
	{
		System.out.println("Subtracting 2 numbers");
	}

	public static void main(String[] args) 
	{
		Static_and_Nonstatic s1 = new Static_and_Nonstatic ();
		s1.addition();
		subtract();
		

	}

}
