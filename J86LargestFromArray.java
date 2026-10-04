package ArrayPrograms;

import java.util.Scanner;
public class LargestFromArray {
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
		
		int largest = Integer.MIN_VALUE;
		for(int i :arr)
		{
			if(i>=largest)
			{
				largest = i;
			}
		}
		System.out.println("Largest From given array is "+largest);
	}
}
