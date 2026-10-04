package ArrayPrograms;

import java.util.Scanner;
public class PositiveNegativeZero {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array : ");
		int []arr= new int [n];
		
		for(int i = 0 ; i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int negative = 0;
		int positive = 0;
		int zero = 0;
		for(int i : arr)
		{
			if(i<0)
			{
				negative++;
			}
			else if(i>0)
			{
				positive++;
			}
			else
				zero++;
		}
		
		System.out.print("Postives from array "+positive+ "\nNegatives from array "+negative+"\nZero from array "+zero);
	}
}
