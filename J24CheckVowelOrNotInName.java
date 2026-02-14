import java.util.*;
class J24CheckVowelOrNotInName
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       
       
       System.out.print("Enter your name : ");
       String name = sc.next();
       
       char ch = name.charAt(0);

       if(!( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
       {
                System.out.println("The name "+ name +" is havig first letter Consonent");
       }
       else
       {
                System.out.println("The name "+ name +" is havig first letter Vowels");
       }

    }
}