import java.util.Scanner; 
class AtmPinVerification
{
	static int attempt = 3;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your Acc. Pin : ");
		int userPin=sc.nextInt();

		int correctPin = 198128;
		double bal = 5000;

		if(userPin!=correctPin)
		{
			System.out.println("Wrong Pin");
			return;
		} 

		System.out.println("Pin Verified...");
		System.out.println();
		System.out.println();



		while(attempt!=0)
		{
		     System.out.println("\n1.Check Balance.\n2.Deposit\n3.Withdraw\n4.LogOut");
		     System.out.print("Enter your preferance : ");
		     int pref = sc.nextInt();
		switch(pref)
		{
		case 1 : 
			{
				System.out.println("Your balance is "+bal+"Rs.");
				break;
			}
		case 2 :
			{
				System.out.print("Enter the pin : ");
				int depoPin = sc.nextInt();

				if(depoPin==correctPin)
				{
					System.out.print("Enter the amount you want to deposite : ");
					double depoAmt = sc.nextDouble();

					if(depoAmt>0)bal+=depoAmt;

					System.out.println("Amount is Debited...");
				    System.out.println("Your balance is "+bal+"Rs."); 
				}
				else
				{
					System.out.println("Wrong Pin");
					attempt--;
					System.out.println("You have "+attempt+" Attempts left.");
				}
				break;
			}
		case 3 : 
			{
				System.out.print("Enter the pin : ");
				int withPin = sc.nextInt();

				if(withPin==correctPin)
				{
					System.out.print("Enter the amount you want to withdraw : ");
					double withAmt = sc.nextDouble();

					if(withAmt>0 && withAmt<=bal)
						bal-=withAmt;

					System.out.println("Amount is Withdrawn...");
				    System.out.println("Your balance is "+bal+"Rs."); 

				}
				else
				{
					System.out.println("Wrong Pin");
					attempt--;
					System.out.println("You have "+attempt+" Attempts left.");
				}
				break;
			}
		case 4 :
			{
				System.out.println("Logged out ");
				System.exit(0);
			}
		default : 
			{
				System.out.println("Invalid Input");
			}
		}
		
		}
		System.out.println("Your Account is Block for 48 HRS");

	}
}