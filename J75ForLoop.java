class ForLoop
{
	public static void main(String[] args) {
		
		// for (int i = 1 ; i<=100 ;i++ )
		// {
		// 	System.out.print(i+" ");
		// }
		// 		System.out.println("\n_____________________\n");

		// for (int i = 100;i>=1 ;i-- )
		// {
		// 	System.out.print(i+" ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (int i =2 ;i<=100 ;i+=2 )
		// {
		// 	System.out.print(i+" ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (int i =1; i<=100 ;i+=2 ) 
		// {
		//     System.out.print(i+" ");	
		// }
		// 		System.out.println("\n_____________________\n");
		// for (char ch = 'a';ch<='z' ;ch++ ) 
		// {
		// 	System.out.print(ch+" ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (char ch = 'A';ch<='Z' ;ch++ )
		// {
		// 	System.out.print(ch+" ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (char ch = 'z';ch>='a' ;ch-- ) 
		// {
		// 	System.out.print(ch+" ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (char ch = 'Z';ch>='A' ;ch-- )
		// {
		// 	System.out.print(ch+" ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (char ch = 'A',i = 1;ch<='Z';ch++ ,i++ )
		// {
		// 	System.out.print(ch+"-"+(i+0)+"  ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (char ch = 'a',i = 97;ch<='z';ch++ ,i++ )
		// {
		// 	System.out.print(ch+"-"+(i+0)+"  ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (char ch = 'A',i = 'a';ch<='Z';ch++ ,i++ )
		// {
		// 	System.out.print(ch+""+i+"  ");
		// }
		// 		System.out.println("\n_____________________\n");
		// for (char ch = 'A',i = 'z';ch<='Z';ch++ ,i-- )
		// {
		// 	System.out.print(ch+""+i+"  ");
		// }

		int i = 1
		for(char ch = 'A' ; ch<='Z';ch=ch+=i)
		{
			System.out.print(ch+" ");
			i++;
			
		}


	}
}