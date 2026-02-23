import java.util.*;
public class J68Methods {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter number one: ");
        int num1=sc.nextInt();

        System.out.print("Enter number two: ");
        int num2=sc.nextInt();

        System.err.println("Sum: "+sum(num1, num2));
        System.out.println("Sub: "+sub(num1, num2));
        System.out.println("Mul: "+mul(num1, num2));
        System.out.println("Div: "+div(num1, num2));
        System.out.println("Mod: "+mod(num1, num2));
    
    }
    public static int sum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    
    // public static int sum(int a, int b,int c)//Method Overloading -->Same Name but differemt parameters
    // {
    //     int sum = a+b+c;
    //     return sum;
    // }
    // public static int sum(byte a, byte b,byte c)//Method Overloading (Signature Overloading)-->Same Name but different parameters type
    // {
    //     int sum = a+b+c;
    //     return sum;
    // }

     public static int sub(int a, int b)
    {
        int sub = a-b;
        return sub;
    }
     public static int mul(int a, int b)
    {
        int mul = a*b;
        return mul;
    }
     public static int div(int a, int b)
    {
        int div = a+b;
        return div;
    }
     public static int mod(int a, int b)
    {
        int mod = a%b;
        return mod;
    }

    // public static int varibaleArrgs(int... a). //Multiple number of input ,Comma Seperated.
    // {
    //     int sum=0;
    //     for(int i:a)
    //     {
    //         sum+=i;
    //     }
    //     return sum;
    // }

}