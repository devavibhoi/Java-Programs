public class J44PatternsInvertedHalfPyramid {

    public static void main(String[] args) {
        
        int n = 5;

        // _ _ _ _ *
        // _ _ _ * *
        // _ _ * * * 
        // _ * * * *
        // * * * * *
        
        for(int i = 1 ; i<= n; i++ )
        {
            for(int j = (n-1); j>=i;j--)
            {
                System.out.print("_ ");
            }
            for(int j = 1 ; j<=i ;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}