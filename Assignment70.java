package Collections;

import java.util.HashMap;
import java.util.Map;



public class Assignment70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> m1=new HashMap<Integer,String>();
m1.put(1, "Ashay");
m1.put(2,"Ayush");
m1.put(3, "Vishal");
for (java.util.Map.Entry<Integer, String> i2:m1.entrySet())
{
System.out.println(i2);	
}
	}

}