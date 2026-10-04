import java.util.Scanner;
class LargestAmong3
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number 1 : ");
		int a = sc.nextInt();

		System.out.print("Enter number 2 : ");
		int b = sc.nextInt();

		System.out.print("Enter number 3 : ");
		int c = sc.nextInt();

		String str = (a>b)?(a>c?(a+"is greatest"):c+" is greatest"):(b>c?(b+" is greatest"):c+" is greatest");

		System.out.println(str);

	}
}