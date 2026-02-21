public class J63ArrangeAscending {

    public static void main(String[] args) {
        
        int arr[] = {9,8,7,6,5,4,3,2,1};
        
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) //Swapping i and j if i is bigger than j.
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}