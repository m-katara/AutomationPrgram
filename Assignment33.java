package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment33 
{
	public static void main(String[] args) 
	{
		
int [] arr=new int[3];
Scanner s1=new Scanner(System.in);

for(int i=0;i<=2;i++)
{
	arr[i]=s1.nextInt();	
}
System.out.println(Arrays.toString(arr));
	}

}
