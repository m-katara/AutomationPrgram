package Inheritance;
class Two //Super Class
{
	 void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
}

public class SingleLevelNonStati extends Two
{
	void mul()
	{
		System.out.println("multiply");
	}
	 void div()
	{
		System.out.println("division");
	}

	public static void main(String[] args) 
	{
		SingleLevelNonStati s1 = new SingleLevelNonStati();
			s1.mul();
			s1.div();
			s1.add();
			s1.sub();

	}

}
