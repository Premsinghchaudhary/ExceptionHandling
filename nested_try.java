package Exception_handling;

import java.util.Scanner;

public class nested_try {
	int num1,num2,res;
	Scanner sc=new Scanner(System.in);
	 
	   public static void main(String args[])
	    {
		   nested_try obj=new nested_try();
		obj.exception();
	    }
		public void exception()
		 {
 	     try {
	      	System.out.println("Enter the numbers:");
	      	num1=sc.nextInt();
			num2=sc.nextInt();
			res=num1/num2;
			System.out.println(res);
			
 	                 try {
 	                	 String name=null;
 	                	 System.out.println("length ="+name.length());
 	                 }
 	                 catch(Exception e) {
 	                	 System.out.println(e);
 	                 }
 	         }
 	     catch(ArithmeticException ar) {
 	    	 System.out.println("second number cannot be zero"+ar);
 	     }
 	     finally {
 	    	 System.out.println("finally block always excuted ");
 	     }
		 }
}