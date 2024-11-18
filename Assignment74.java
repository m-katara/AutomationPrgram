package Collections;

class Amazon{
	
	
	private String emailid="abc@gmail.com";

	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	
	
}
public class Assignment74 extends Amazon
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment74 as=new Assignment74();
		as.setEmailid("anila@abc.com");
		System.out.println(as.getEmailid());
	}

	
}
