package Inheritance;
class Reporting
{
	Reporting()
	{
		System.out.println("Reporting");
	}
}
class Screenshot extends Reporting
{
	Screenshot()
	{
		super();
		System.out.println("Screenshot");
	}
}

public class SuperCallingStatement extends Screenshot
{
	SuperCallingStatement()
	{
		super(); 
		System.out.println("Test Case1");
	}

	public static void main(String[] args)
	{
		 new SuperCallingStatement();
		
	}

}
