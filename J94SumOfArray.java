package ArrayPrograms;

import java.util.Scanner;
public class SumOfArray {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []arr= new int[n];
		
		for(int i = 0; i<n; i++)
		{
			arr[i]= sc.nextInt();
		}
		SumOfArray.sumOfArray(arr);
	}
	public static void sumOfArray(int[]arr)
	{
		int sum = 0;
		for(int i : arr)
		{
			sum+=i;
		}
		System.out.print("Sum of the array is "+sum);
	}
}
