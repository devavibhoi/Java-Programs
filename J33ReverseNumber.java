import java.util.Scanner;
class J33ReverseNumber
{
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter a number : ");
     int num = sc.nextInt();
     System.out.println();

     int rev = 0 ;

     for(int i = num;i>0;i/=10)
     {
        int rem = i%10;
        rev = rev*10+rem;
     }
     System.out.println(rev);
    }
}