import java.util.*;
class J39DoWhileCalculator
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int choice ;
      do
      {
        
        
        System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Modulus \n 6.Exit ");
        System.err.println();
        System.out.print("Enter an operator :");
         choice = sc.nextInt();

        if(choice>=1 && choice<=5)
        {
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.err.println();
        
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.err.println();

            switch (choice) {
                case 1 :
                    System.out.println("Result : "+(num1+num2));
                    break;
                case 2 :
                    System.out.println("Result : "+(num1-num2));
                    break;
                case 3 :
                    System.out.println("Result : "+(num1*num2));
                    break;
                case 4 :
                    if(num2!=0)
                    {
                    System.out.println("Result : "+(num1/num2));
                    }
                    else
                    {
                    System.out.println(num1+" can not be divided by 0.");
                    }
                    break;
                case 5 :
                     if(num2!=0)
                    {
                    System.out.println("Result : "+(num1%num2));
                    }
                    else
                    {
                    System.out.println(num1+" can not be Modulus by 0.");
                    }
                    break;
                default:
                    break;
            }
        }
        else if (choice!=6)
        {
            System.out.println("Invaillid input,Please try again.");
        }

    }
    while(choice!=6);
    
        System.out.println("*** Exit ***");
    
    }
}
