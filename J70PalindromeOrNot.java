import java.util.*;

public class J70PalindromeOrNot 
{
    public static boolean palindromOrNot(int x)//767
    {
        int dup=x;
        int rem=0;

        while(x>0)
        {
       
            int digit=x%10 ; //767%10-->7
            rem=rem*10+digit;//7
            x=x/10;//767/10-->76

        }
        return dup==rem;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(palindromOrNot(num))
        {
        System.out.println(num+" is a palindrome number.");
        }
        else
        {
            System.out.println(num+" is not a palidrome mnumber.");
        }


    }
}
    