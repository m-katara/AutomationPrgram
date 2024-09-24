package BasicJavaProgram;

public class mainmethod_nonstatic_overload 
{

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		
		mainmethod_nonstatic_overload c1= new mainmethod_nonstatic_overload();
		c1.main();
		main("Mayur", 'M');

	}
	public void main() 
	{
		System.out.println("Main method with no argument");
		

	}
	public static void main(String name,char gender) 
	{
		System.out.println("Main methos with argument string and char");
		

	}

}