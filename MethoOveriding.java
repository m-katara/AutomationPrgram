package Inheritance;
class Parent_Class
{
	void login()
	{
		System.out.println("login with my email Id");
	}
}

public class MethoOveriding extends Parent_Class
{
	void login()
	{
		System.out.println("Login with mob number");
	}

	public static void main(String[] args) 
	{
		MethoOveriding m1 = new MethoOveriding();
		m1.login();

	}

}
