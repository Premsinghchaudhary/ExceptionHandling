package Exception_handling;

import java.util.Scanner;

public class demo_try 
{
int num1,num2,res;
Scanner sc=new Scanner(System.in);
 
   public static void main(String args[])
    {
	demo_try obj=new demo_try();
	obj.divisoin();
    }
	public void divisoin()
	 {
		
		try
		{
			System.out.println("Enter the numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=num1/num2;
		System.out.println(res);
		}
		catch(ArithmeticException e) 
		{
		System.out.println(" The second number cannot be use zero  "+e);	
		}
	  }
		
}
