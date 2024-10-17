package AbstractPackage;

public class Assignment54 
{  
	public void add()    //	//Non-Static Method!
	
	{ System.out.println("This is public Method"); }
	
	private void sub()
	
	{System.out.println("This is private Method");}
	
	protected void divid ()
	
	{System.out.println("This is protected Method"); }
	
	void mul()
	
	{System.out.println("This is Default Method");}
	
	public static void main(String[] args) 
	{
		Assignment54 a1 = new Assignment54();
		
		a1.add();
		a1.divid();
		a1.mul();
		
	    // a1.sub(); we cant access the private access
	}

}