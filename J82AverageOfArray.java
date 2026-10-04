package ArrayPrograms;

import java.util.Scanner;
public class AverageOfArray 
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		
		System.out.println("Enter the "+n+" elements: ");
		for(int i=0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum = 0;
		for(int i :arr)
		{
			sum+=i;
		}
		int avg = sum/arr.length;
		System.out.println("The average of given array is "+avg);
		
	}
}
