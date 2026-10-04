package ArrayPrograms;

import java.util.Scanner;
public class TakeInputAndPrintArray {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int len = sc.nextInt();
		
		int []arr = new int[len];
		
		System.out.println();
		
		System.out.println("Enter the "+len+" Elements : ");
		for(int i = 0 ; i <= len ; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		for(int x : arr)
		{
			System.out.println(x);
		}
	}
}
