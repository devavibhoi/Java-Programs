import java.util.Scanner;
public class J58PatternsCrossSquare {

    public static void main(String[] args) {
        
        //     * * * * * 
        //    * * * * * 
        //   * * * * * 
        //  * * * * *
        // * * * * *

        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number of rows : ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=(n-1);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.err.print("* ");
            }
            System.out.println();
        }

    }
}