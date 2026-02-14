public class J46PatternsHillStation {

    public static void main(String[] args) {
        
        // _ _ _ _ * 
        // _ _ _ * * * 
        // _ _ * * * * * 
        // _ * * * * * * * 
        // * * * * * * * * *

        int n = 5;
        for(int i = 1 ; i <= n; i++)
        {
            for(int j = n-i ; j>=1;j--)
            {
                System.out.print("_ ");
            }
            for(int j = 1; j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j= 1; j<i;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}