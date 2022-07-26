package Exception_handling;
import java.util.Scanner;
public class multiple_catch {
int num1,num2,res;
Scanner sc=new Scanner(System.in);
   public static void main(String args[])
    {
	multiple_catch obj=new multiple_catch();
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
		int[]arr=new int[5];
		arr[6]=100;
		System.out.println(arr[6]);
		}
		catch(ArithmeticException e) 
		{
		System.out.println(" The second number cannot be use zero  "+e);	
		}
		catch(ArrayIndexOutOfBoundsException ae) 
		{
		System.out.println("Message" +ae.getMessage());	
		
	  }
		
	 }
}