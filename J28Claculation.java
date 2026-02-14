import java.util.*;
class J28Claculation
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number one : ");
     double num1 = sc.nextDouble();
     System.out.println();
     
     System.out.print("Enter number two : ");
     double num2 = sc.nextDouble();
     System.out.println();

     System.out.print("Enter the Operation :");
     char op = sc.next().charAt(0);

     double output = 0 ;
     
     boolean flag = true;
     
     if(op == '+')
     {
       output = num1+num2;
     }
     else if (op == '-')
     {
       output = num1-num2;
     }
     else if (op=='/')
     {
       output = num1/num2;
     }
     else if (op=='*')
     {
       output = num1*num2;
     }
     else if (op=='%')
    {
       output = num1%num2;
    }
    else 
    {
        flag = false;
        System.out.println("Invalid input ,Please try again.");
    }

    if(flag)
    {
       System.err.print("Output : " + num1+" "+op+" "+num2 +" = "+output);
    }
    }
}