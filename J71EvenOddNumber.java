import java.util.Scanner;
class J71EvenOddNumber
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (EvenOdd(num) == true) {
            System.out.print("The number " + num + " is Even.");
        } else {
            System.out.print("The number " + num + " is Odd.");
        }
    }
    public static boolean EvenOdd(int x)
    {
        boolean even= false;
        if(x % 2 == 0)
        {
            even = true;
        }
        return even;
    }
}