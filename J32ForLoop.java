import java.util.Scanner;
public class J32ForLoop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        for( int i = 1 ; i<= 10; i++ )
        {
            System.out.print(i+ " ");
        }
        for (int j = 100; j>=50 ;j--)
        {
            System.out.println(j);
        }
        for (char k = 'A';k<='Z';k++)
        {
            System.out.println(k+" ");
        }
        for(char l='z';l>='a';l--)
        {
          System.out.println(l);
        }
         for (int k = 'A';k<='Z';k++)
        {
            System.out.println(k+" ");
        }
         for(int l='z';l>='a';l--)
        {
          System.out.println(l);
        }
        for(int e = 1;e<=100;e+=2)
        {
            System.out.println(e);
        }
        for(int o = 2;o<=100;o+=2)
        {
            System.out.println(o);
        }
    }
}