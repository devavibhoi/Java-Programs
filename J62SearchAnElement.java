import java.util.*;
public class J62SearchAnElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int num = sc.nextInt();

        int arr[]= new int[num];

        System.out.println("Enter the values: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("                 ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Entered array is:[");
        for(int i =0;i<arr.length;i++)
        {
            System.err.print(arr[i]);

            if(i<num-1)
            {
                System.out.print(", ");
            }
            else
            {
                System.out.print("]");
                System.out.println();
            }
            

        }
        System.out.print("Enter the number to check: ");
        int check=sc.nextInt();

        
        boolean found = false;
        for(int i=0;i<arr.length;i++)
        {
        if(check==arr[i])
        {
            System.out.println("Number found at index "+i+".");
            found =true;
            break;
        }
        }
        if(found==false)
        {
            System.out.println("Number not found.");
        }
    }
}