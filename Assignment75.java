package Collections;

public class Assignment75 {
String password="abc";
void method(String password)
{
	this.password=password;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment75 as=new Assignment75();
//String password="123";
as.method("123");
System.out.println(as.password);
	

	}}