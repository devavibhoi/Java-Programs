import java.util.Scanner;
public class J65SumOfArray
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int num = sc.nextInt();

        int arr[]= new int[num];//if directly put num it only consider 1 element --> {num}
        System.out.println("Enter the elements: ");
        for(int i=0;i<num;i++)
        {
            System.out.print("                  ");
            arr[i]=sc.nextInt();
        }

        System.out.print("The array is: [");
        for(int element:arr)
        {
            System.out.print(element);
            if (element<num)
            {
                System.out.print(", ");
            }

        }
        System.out.println("]");

        int sum=0;
        for(int element:arr)
        {
            sum=sum+element;
        }
        System.out.println("The sum of given array is "+sum+".");
    }
}