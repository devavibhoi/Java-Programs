import java.util.Scanner;
public class J60FindMaximumAndMinimumElement {

         public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of Array = ");
        int num=sc.nextInt();
        int []arr= new int[num];
        System.out.println();

        System.out.println("Enter the "+num+" values = ");
        for(int i=0;i<num;i++)
        {
            System.out.print("                    ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Entered Array is =[");
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]);

            if(i<num-1)
            {
            System.out.print(",");
            }
            else
            {
            System.out.println("]");
            }
        }
System.out.println();

        int max= arr[0];
        int min= arr[0];

        for(int i=0;i<num;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("Maximum number from array is "+max+".");
        System.out.println("Minimum number from array is "+min+".");
    }
}