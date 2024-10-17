package AbstractPackage;
abstract class ThirdClass
{
	abstract void method1();
	abstract void method2(); 
	void method3()
	{
		System.out.println("Logic for logout from system");
	}
}
abstract class SecondClass extends ThirdClass
{
	abstract void method4();
	abstract void method5();
}

public class FirstClass extends SecondClass
{

	public static void main(String[] args) 
	{
		

	}

	
	void method4() 
	{
		
	}

	
	void method5() 
	{
		
		
	}

	
	void method1() 
	{
		
		
	}

	
	void method2() 
	{
		
	}

}
