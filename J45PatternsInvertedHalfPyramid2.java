public class J45PatternsInvertedHalfPyramid2 {

    public static void main(String[] args) {
        

    // * * * * * 
    // _ * * * *
    // _ _ * * * 
    // _ _ _ * * 
    // _ _ _ _ *   

        int n = 5;

        for(int i = 1 ; i<=n;i++)
        {
            for(int j = i-1; j>=1;j--)
            {
                System.out.print("_ ");
            }
            for(int j = i;j<=n;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
