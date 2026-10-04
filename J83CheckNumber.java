package ArrayPrograms;

import java.util.Scanner;
public class CheckNumber {
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements : ");
		int[]arr= new int[n];
		
		for(int i=0;i<arr.length ; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter number to check: ");
		int num = sc.nextInt();
		
		for(int i :arr)
		{
			if(num==i)
		   {
			System.out.print(num+ " is found in the array");
			return;
		   }
			System.out.print("Number is not found in the array");
			return;
		}
	}

}
