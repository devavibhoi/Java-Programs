package ArrayPrograms;


public class ArraysDeclaration {

	public static void main(String []args)
	{
		int []arr1 = new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
//		arr[6]=60;
		
		for(int i : arr1)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		int[]arr2= {11,12,13,14,12};
		for(int i : arr2)
		{
			System.out.println(i);
		}
		
		int []arr3 = new int[]{10,20,20,30,10};
		
		for (int i : arr3)
		{
			System.out.println(i);
		}
}
}
