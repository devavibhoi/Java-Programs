import java.util.Scanner;
class LargestAmong2
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number 1 : ");
		int a = sc.nextInt();

		System.out.print("Enter number 2 : ");
		int b = sc.nextInt();

		String str = a>b?a+" is grater than "+b: b+" is greater than "+a;

		System.out.println(str);

	}
}