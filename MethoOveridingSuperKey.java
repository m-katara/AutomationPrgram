package Inheritance;

class Parents_Class
{
	void login()
	{
		System.out.println("login with my email Id");
	}
}

public class MethoOveridingSuperKey extends Parents_Class
{
	void login()
	{
		System.out.println("Login with mob number");
		super.login();
	}

	public static void main(String[] args) 
	{
		MethoOveridingSuperKey m1 = new MethoOveridingSuperKey();
		m1.login();

	}

}