package ArrayPrograms;

import java.util.Scanner;
public class CountEvenOdd {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length of Array");
		int n = sc.nextInt();
		
		int []arr =new int[n];
		
		System.out.println("Enter the elements : ");
		
		for(int i = 0 ; i <arr.length; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int oddCount = OddCount(arr);
		int evenCount = EvenCount(arr);
		
		System.out.println("From array....\n Even are "+evenCount+"\n Odd are "+oddCount);
		
	}
	public static int OddCount(int []arr) 
	{
		int oddCount = 0;
		for(int i :arr)
		{
			if(i%2==1)
			{
				oddCount++;
			}
		}
		return oddCount; 
	}
	public static int EvenCount(int...arr)
	{
		int evenCount= 0;
		for(int i :arr)
		{
			if(i%2==0)
			{
				evenCount++;
			}
		}
		return evenCount; 
	}
}
