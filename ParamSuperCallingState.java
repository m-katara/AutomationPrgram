package Inheritance;

class Aeroplane
{
	Aeroplane(String a)
	{
		System.out.println("This is airplane");
	}
}
class Helicopter extends Aeroplane
{
	Helicopter(int a, int b)
	{
		super("Mayur");
		System.out.println("This is helicopter");
	}
}
class Chopper extends Helicopter
{
	Chopper(int a, double c)
	{
		super(10, 20);
		System.out.println("This is chopper");
	}
}

public class ParamSuperCallingState extends Chopper
{
	ParamSuperCallingState()
	{
		super(15, 20.5);
	System.out.println("Main class running");
	}
	public static void main(String[] args) 
	{
		new ParamSuperCallingState();
	}

}
