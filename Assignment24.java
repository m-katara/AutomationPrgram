package AbstractPackage;

interface Mail 
{
	void Gmail();
	void Ymail();
}

interface SocialNetwork 
{
	void instagram();
	void facebook();
}

public class Assignment24 implements Mail, SocialNetwork 

{
	@Override
	public void instagram() 
	{
		System.out.println("Instagram");
	}

	@Override
	public void facebook()
	{
		System.out.println("face book");
	}
	@Override
	public void Gmail() 
	{
		System.out.println("Gmail");
	}
	@Override
	public void Ymail()
	{
		System.out.println("yahoomail");
	}
	
	public static void main(String[] args)   //Main Method
	{
		Assignment24 A1 = new Assignment24();  //creating an object for child class
		
		A1.Gmail();   //inteface main Abstract  methods 
		A1.Ymail();
		
		A1.instagram(); 
		A1.facebook();
	}
}
