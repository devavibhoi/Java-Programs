import java.util.*;
class J40PatternsRecatngle
{
//    * * * * * 
//    * * * * * 
//    * * * * * 
//    * * * * * 

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle : ");
        byte length = sc.nextByte();
        System.out.println();

        System.out.print("Enter breadth of the rectangle : ");
        byte breadth = sc.nextByte();
        System.out.println();

        for(int i = 1; i<=breadth; i++)
        {
            for(int j = 1; j<=length  ; j++)
            {
                System.out.print("* ");
            }
             System.out.println();
        }
       
    }
}