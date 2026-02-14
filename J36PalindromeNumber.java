import java.util.*;
class J36PalindromeNumber
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();
       System.out.println();

       int rev = 0;
       int dup = num;

       while (!(num==0)) 
       {
         int rem = num%10;
             rev = rev*10+rem;
             num/=10;
       }
       if(dup==rev)
       {
        System.out.println("The number "+dup+" is a Palindrome.");
       }
       else{
        System.out.println("The number "+dup+" is not Palindrome");
       }
    }
}