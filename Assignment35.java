package StringPackage;

import java.util.Arrays;

public class Assignment35 
{
	public static void main(String[] args) 
	{
		
String a="cafe";
String b="face";
char[] c1=a.toCharArray();
char[] c2=b.toCharArray();
System.out.println(Arrays.toString(c2));
System.out.println(Arrays.toString(c1));
Arrays.sort(c2);
Arrays.sort(c1);
boolean b1=Arrays.equals(c1, c2);
if(b1==true)
{
	System.out.println("anagram");
}
else
	{
	System.out.println("Not Anagram");}
	}


}
