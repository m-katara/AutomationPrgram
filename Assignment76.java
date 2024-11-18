package Collections;

class object
{
	void sub()
	{
		System.out.println("perform subtraction");
	}
}
class parents extends object{
	void add()
	{
		System.out.println("perform addition");	
	}
}
public class Assignment76 extends parents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parents p1	=new Assignment76();//upcasting
		p1.add();
		p1.sub();
		Assignment76 c1=(Assignment76) p1;//downcasting
		child c2=new child();
		c2.mult();
	}

}
class child extends Assignment76
{
	void mult()
	{
		System.out.println("perform multiplication");
	}
	}