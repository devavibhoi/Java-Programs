import java.util.*;
public class J61ReverseArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");// 4
        int num= sc.nextInt();

        int arr[]=new int[num];

        System.out.println("Enter the elements: "); // 1,2,3,4
        for(int i=0;i<num;i++)
        {
            System.out.print("                 ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Entered array is: [");//[1, 2, 3, 4]
        for(int i=0;i<num;i++)
        {

            System.out.print(arr[i]);
            if(i<num-1)//up to 3
            {
                System.out.print(", ");
            }
            else//last element
            {
                System.out.println("]");
            }
            
        }
                // Reverse Array
            int start = 0;
            int end = num-1;

            while(start<end)//reversed 
            {
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;

            }
         System.out.print("Reversed array is:[");//print reversed array
        for(int i=0;i<num;i++)
            {
                System.out.print(arr[i]);
                if(i<num-1)
                {
                    System.out.print(", ");
                }
                else
                {
                    System.out.println("]");
                }
            }
    }
}