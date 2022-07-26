package Exception_handling;

import java.util.Scanner;

public class use_of_user_def_exp {
	int n1;
	Scanner sc=new Scanner(System.in);
	public static void main(String abc[])
	{
		 use_of_user_def_exp obj=new use_of_user_def_exp ();
		obj.call_demo();
	}
	
	public void call_demo()
	{
		try
		{
			System.out.println("Enter a number");
			n1=sc.nextInt();
			if(n1>0)
			{
				throw new user_def_exception("THE NUMBER IS POSITIVE");
			}
			else
			{
				throw new user_def_exception("THE NUMBER IS NEGIATIVE");
			}
		}
		catch(user_def_exception e)
		{
			System.out.println("MSG:"+e.getMessage());
		}
	}
}
	


