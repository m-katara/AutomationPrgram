package Inheritance;

public class ThisCallingState 
{
	ThisCallingState()
	{
		this(45);
		System.out.println("1st");
	}
	ThisCallingState(int a)
	{
		this(100,200);
		System.out.println("2nd");	
	}
	ThisCallingState(int a,int b)
	{
		this(28,"Arun");
		System.out.println("3rd");	
	}
	ThisCallingState(int a,String b)
	{
		System.out.println("4th");	
	}
	
	
	public static void main(String[] args) 
	{
		
		new ThisCallingState();
	}

}
