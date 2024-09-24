package BasicJavaProgram;

public class Construct_Overload 
{
	Construct_Overload()
	{
		System.out.println("1st");
	}
	Construct_Overload(int a)
	{
		System.out.println("2nd");
		
	}

	public static void main(String[] args) 
	{
		new Construct_Overload();
		new Construct_Overload(200);

	}

}
