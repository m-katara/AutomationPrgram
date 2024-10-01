package Inheritance;

class One //Super Class
{
	static void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}
}

public class SingleLevelStati  extends One // Sub class
{
	static void mul()
	{
		System.out.println("multiply");
	}
	static void div()
	{
		System.out.println("division");
	}
	public static void main(String[] args) 
	{
		mul();
		div();
		add();
		sub();

	}

}
