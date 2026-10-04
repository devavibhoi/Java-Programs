package ArrayPrograms;

import java.util.Scanner;
public class Shift1FromLeft {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n = sc.nextInt()
;		int []arr = new int[n];
		
		for(int i =0 ;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		int temp = arr[0];// 50

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
		
		for(int i :arr)
		{
			System.out.print(i+" ");
		}
	}
}
