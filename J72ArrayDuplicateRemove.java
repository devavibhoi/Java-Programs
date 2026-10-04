
class ArrayDuplicateRemove
{
   public static void main(String[]args)
   {
   	int arr[]= {10,20,30,10,20,40,50,60,40,60,50,80,70,90};

   	int j = 0;
   	for(int i = 1;i<arr.length;i++)
   	{
   		if(arr[i]!=arr[j])
   		{
   			i++;
   			arr[i]=arr[j];
   		}
   	}
   	for(int x : arr)
   	{
   		System.out.print(x+" ");
   	}
   }
}