package ArrayPrograms;

public class PrintArray01 {

	public static void main(String[] args) {
		
		int []i = {1,2,3,4,5};
		
		for(int x = 0; x<i.length ; x++)
		{
			System.out.println(i[x]);
		}
		
		System.out.println("--------------");
		
		for(int x : i)
		{
			System.out.println(x);
		}
	}
}
