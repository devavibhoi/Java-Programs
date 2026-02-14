import java.util.Scanner;
class J23ScannerClass
{
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a first number : ");
      int num1 = sc.nextInt();

      System.out.print("Enter a first number : ");
      int num2 = sc.nextInt();

      int add = num1+num2;
      System.out.println("The addition of two numbers is "+add);
    }
}