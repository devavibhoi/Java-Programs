package ArrayPrograms;

import java.util.Scanner;
public class ReverseArray {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		int []arr = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=arr.length;i>0;i--)
		{
			System.out.print(i+" ");
		}
	}
}
