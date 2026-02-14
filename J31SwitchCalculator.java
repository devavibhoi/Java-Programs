import java.util.*;
class J31SwitchCalculator
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.println(" **** Claculator ****");
      System.out.println();

      System.out.print("Enter number 1 : ");
      double num1 = sc.nextDouble();
      System.out.println();

      System.out.print("Enter number 2 : ");
      double num2 = sc.nextDouble();
      System.out.println();

      System.out.print("Enter the operator : ");
      char op = sc.next().charAt(0);
      System.out.println();

      double output ;

      switch(op)
      {
        case '+':
          {
            System.out.println("Result : "+(num1+num2));
            break;
          }
        case '-':
          {
            System.out.println("Result : "+(num1-num2));
            break;
          }
        case '*':
          {
            System.out.println("Result : "+(num1*num2));
            break;
          }
        case '/':
          {
            if(!(num2==0))
            {
            System.out.println("Result : "+(num1/num2));
            }
            else
            {
            System.out.println("Division by 0 is not allowed.");
            }
            break;
          }
        case '%':
          {
           if(!(num2==0))
            {
            System.out.println("Result : "+(num1%num2));
            }
            else
            {
            System.out.println("Modulus by 0 is not allowed.");
            }
            break;
          }
        default:
          {
            System.out.println("Invalid input,Please try again.");
          }
      }
    }
}