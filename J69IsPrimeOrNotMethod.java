import java.util.Scanner;
public class J69IsPrimeOrNotMethod {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");


        int num = sc.nextInt();

        if(isPrime(num)==true)
        {
            System.out.println("Entered number "+num+" is prime.");
        }
        else
        {
            System.out.println("Entered number "+num+" is not prime.");
        }
        
        
    }

    public static boolean isPrime(int a)
    {
        int div =0;
        for(int i= 1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                div++;
            }
        }
       return div==1;
    }
    
}
