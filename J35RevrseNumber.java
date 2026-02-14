import java.util.*;
public class J35RevrseNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int rev =0;
        System.out.println();

        while (!(num==0))
        {
            int rem = num%10;
            rev = rev*10+ rem;
            num/=10;
        }
        System.out.println("Reverse of the"+num+" is "+rev);
    }

}