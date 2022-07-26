package Exception_handling;
import java.util.Scanner;
public class throw_ {
		int a;
		Scanner sc=new Scanner(System.in);
		public static void main(String[] args) 
		{
			throw_ obj=new throw_();
			obj.even_odd();
		}

		public void even_odd()
		{
			try
			{
				System.out.println("Enter a number");
				a=sc.nextInt();
				check_demo(a);
			}
			catch (ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
		}

		 void check_demo(int b) 
		 {
			 if(b %2==0)
			 {
				 throw new ArithmeticException("It is an even Number ....");
			 }
			 else
			 {
				 throw new ArithmeticException("It is odd...");
			 }
			
		}
	}
