package ArrayPrograms;

import java.util.Scanner;

public class RemoveDuplicateFromSorted {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements: ");
		
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int i = 0;
		for(int j = 1;j<arr.length;j++) {
			if(arr[i]!=arr[j])
			{
				i++;
				arr[i]=arr[j];
			}
		}
		int uniqueElements = i+1;
		for(int j=0;j<uniqueElements;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
}
