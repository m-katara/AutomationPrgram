package BasicJavaProgram;

public class main_method_overload 
{

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		main();
		main("Mayur", 'M');

	}
	public static void main() 
	{
		System.out.println("Main method with no argument");
		

	}
	public static void main(String name,char gender) 
	{
		System.out.println("Main methos with argument string and char");
		

	}

}
