import java.util.*;
public class J54PatternsInvertedHalfPyramidWithNumber {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        //  1 2 3 4 5
        //  1 2 3 4 
        //  1 2 3
        //  1 2 
        //  1

        System.out.print("Enter the number of rows : ");
                int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
         for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            } 
            System.out.println();
        }


    }
}