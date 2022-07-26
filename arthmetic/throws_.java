package Exception_handling;

import java.util.Scanner;

public class throws_ {
	int size,i;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		try
		{
			throws_ obj=new throws_();
			obj.demo();
		}
		catch(Exception e)
		{
			System.out.println("size of zero is not accees: "+e);
		}	
	
	}

	public void demo() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Enter a size ");
		size=sc.nextInt();
		if(size==0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int arr[]=new int[size];
		System.out.println("Enter "+size+" numbers");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.println("The array number is = ");
			for(i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
	}

}
