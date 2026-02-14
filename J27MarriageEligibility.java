import java.util.*;
class J27MarriageEligibility
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter your age : ");
     byte age = sc.nextByte();

     System.out.print("Enter yout property amount : ");
     int property = sc.nextInt();
     
     if(age>=21 && property>=1000000)
     {
       System.out.println("You are directly Eligible for marriage.");
     }
     else
    {
        System.out.println("You are not Eligible for marriage.");
    }
   
   }
    
}
