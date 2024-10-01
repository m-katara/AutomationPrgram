package Inheritance;
class Aeroplanes
{
	Aeroplanes()
	{
		System.out.println("This is airplane");
	}
}
class Helicopters extends Aeroplanes
{
	Helicopters()
	{
		System.out.println("This is helicopter");
	}
}
class Choppers extends Helicopters
{
	Choppers()
	{
		System.out.println("This is chopper");
	}
}

public class NonParamSuperCalling extends Choppers
{
	NonParamSuperCalling()
	{
		super();
	System.out.println("Main class running");
	}
	public static void main(String[] args) 
	{
		new ParamSuperCallingState();
	}

}

