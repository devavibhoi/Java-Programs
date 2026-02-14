import java.util.*;
class J26EligibleForInterviewOrNot
{
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your ATS score : ");
    byte ats = sc.nextByte();

    if(ats>=0 && ats<=100)
    {
        if(ats>=60)
        {
            System.out.println("You are eligible for Interview.");
        }
        else
        {
           System.out.println("You are not eligible for Interview.");
        }
    }
    else
    {
        System.out.println("Invalid Input ;please try agin.");
    }
   }
}