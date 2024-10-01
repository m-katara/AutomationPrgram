package Inheritance;
class Class3
{
	 void add1(int x, int y)
	{
		System.out.println("addition of 2 numbers");
	}
}
class Class2 extends Class3
{
	static void add2(int x, double y)
	{
		System.out.println("addition of 2 decimal numbers");
	}
}

class Class1 extends Class2
{
	static void add3(int x, double y)
	{
		System.out.println("addition of 2 decimal numbers");
	}
}

public class multilevel extends Class1
{
	 void add4(int x, int y, double z)
	{
		System.out.println("addition of 3 decimal numbers");
	}
	public static void main(String[] args)
	{
		 multilevel m1 = new  multilevel();
		m1.add4(23, 24, 466666.5);
		add3(45, 54.8);
		add2(45, 76.9);    
		m1.add1(23, 67);
	}

}
