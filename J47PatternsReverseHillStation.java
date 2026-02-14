public class J47PatternsReverseHillStation
{
  public static void main(String[] args) {
    
    // * * * * * * * * * 
    // _ * * * * * * * 
    // _ _ * * * * * 
    // _ _ _ * * * 
    // _ _ _ _ *
    
    int n = 5;

    for(int i = 1 ; i<=n; i++)
    {
        for(int j = 1; j<i;j++)
        {
            System.out.print("_ ");
        }
        
        for(int j = n ;j>=i;j--)
        {
            System.out.print("* ");
        }
        for(int j= (n-1);j>=i;j--)
        {
            System.out.print("* ");
        }

        System.out.println();
    }
  }
}