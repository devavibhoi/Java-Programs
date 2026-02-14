import java.util.*;
class J37DoWhileLoop
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     int correctpin = 221120;
     int pin ;
     int attempts = 0;
    
     do{
        System.out.print("Enter your PIN : ");
        pin = sc.nextInt();
        attempts++;
        if(pin==correctpin)
        {
            System.out.println("Phone Unlocked");
            break;
        }
        else{
            System.out.println("Incorrect pin, Please try again.....!");
        }
     }
     while(attempts<3);
     
     
   }
}