import java.util.Scanner;
class J41PatternsSquare
{

    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 

 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of square : ");
        byte length = sc.nextByte();
        for(int i = 1 ; i<=length ;i++)
        {
            for(int j =1; j<=length;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}