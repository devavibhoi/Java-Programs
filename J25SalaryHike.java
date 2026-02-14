import java.util.*;
class J25SalaryHike
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Salary : ");
        double sal = sc.nextDouble();

        System.out.print("Enter Your Score : ");
        int score = sc.nextInt();

        System.out.println();

        System.out.println("The privious salary was "+sal+"rs.");
        System.out.println("And the score is "+score+".");
      
        if(score>= 0 && score <=100)
        {
           if(score>=90)
           {
            sal = sal + (sal*3/100);
            System.out.println("The salary hike by 3% and new salary became "+sal+"rs.");
           }
           else
           {
            sal = sal+(sal/100);
            System.out.println("he salary hike by 3% and new salary became "+sal+"rs.");
           }
        }
        else
        {
          System.out.println("Invalid input please try again.");
        }


     }
}