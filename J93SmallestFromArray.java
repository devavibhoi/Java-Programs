package ArrayPrograms;

import java.util.Scanner;
public class SmallestFromArray {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int []arr = new int [n];
		System.out.print("Enter the elements: ");
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int smallest = Integer.MAX_VALUE;
		for(int i :arr)
		{
			if(i<=smallest)
			{
				smallest = i;
			}
		}
		System.out.println("Smallest12 From given array is "+smallest);
	}
}
