import java.util.Scanner;
class NumberPrograms

     
{
	 static int num;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		sumOfNumbers();
		productOfNumber();
		reverseOfNumber();
		isPalindrome();
	}
	public static void sumOfNumbers()
	{
		int sum = 0;
		for (int i=num ; i>0 ; i/=10 )
		{
			int rem = i % 10 ;
			sum+=rem ;
		}		
		System.out.println("Sum of the number is "+sum);
	}
	public static void productOfNumber()
	{
		int prod = 1;
		for (int i=num ; i>0 ; i/=10 )
		{
			int rem = i % 10 ;
			prod*=rem ;
		}		
		System.out.println("Product of the number is "+prod);
	}
	public static int reverseOfNumber()
	{
		int rev = 0;
		for (int i=num ; i>0 ; i/=10 )
		{
			int rem = i % 10 ;
			rev = rev*10 +rem ;
		}		
		System.out.println("Reverse of the number is "+rev);

		return rev;
	}
	public static void isPalindrome()
	{
		int pal = reverseOfNumber();
		if(pal==num)
		{
			System.out.println(num+" is a palindrome number ");
		}
		else
		{
			System.out.println(num+ " is not a palindrome number.");
		}
	}
}