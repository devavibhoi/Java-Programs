import java.util.Scanner ;
class Instagram
{
  static String userName = "avi_bhoi_63";
  static String password = "@viBhoi098" ;
  static long phNumber = 7719897515l;
  static int backupCode =198128 ;
  static int attempt = 3;


	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print(" 1.Login using Username \n 2.Login using mobile Number \n 3.Login using Backup Code")
    
	System.out.print("Enter option : ")
	byte input = sc.nextByte();

    if(attempt>0)
    {
	switch(input)
	{
	case 1 : 
	       System.out.print("Enter the username : ");
           String id = sc.nextLine();
           System.out.print("Enter the password");
           String pass = sc.nextLine();
	       Instagram.login(id,pass);
	       break;
	case 2 :
	       System.out.print("Enter the Mobile Number : ");
           long id = sc.nextLong();
           System.out.print("Enter the password");
           String pass = sc.nextLine();
	       Instagram.login(id,pass);
	       break;
	case 3 :
	        System.out.print("Enter the bakcup code : ")
            int backup = sc.nextInt();
            login(backup);
            break;
    default :
            System.out.printlin("invalid input...."+attempt+" left..");
            attempt--;
	}
	}


	}
	  public static void login(String userName , String password)
	  {
	    if(userName==this.userName && password==this.password)
	    {
	      return return Instagram.homePage();
	    }
	    else 
	      return System.out.println("Invalid Credentials");
	  }
	  public static void login(int phNumber , String password)
	  {
	    if(phNumber==this.phNumber && password==this.password)
	    {
	      return Instagram.homePage();
	    }
	    else 
	      return System.out.println("Invalid Credentials");
	  }
	  public statci void login(int backupCode)
	  {
	    if(backupCode==this.backupCode)
	    {
	      return return Instagram.homePage();
	    }
	    else 
	      return System.out.println("Invalid Credentials");
	  }
	  public static void homePage()
	  {
	     System.out.println("Logged in"); 
	  }
}