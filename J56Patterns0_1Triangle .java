import java.util.*;
class J56Patterns0_1Triangle 
{
   public static void main(String []args)
    {

        // 1
        // 0 1
        // 1 0 1 
        // 0 1 0 1
        // 1 0 1 0 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((j+i)%2==0)
                {
                    System.err.print(1+" ");
                }
                else
                {
                   System.err.print(0+" ");
                }
               
            }
            System.out.println();
        }
    }
}