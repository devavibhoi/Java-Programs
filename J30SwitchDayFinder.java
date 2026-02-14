import java.util.*;
class J30SwitchDayFinder
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("1.Monday\n2.Tuesday\n3.Wednesday\n4.Thusday\n5.Friday\n6.Saturday\n7.Sunday");
        System.out.println();
        
        System.out.print("Enter day number : ");
        int day = sc.nextInt();
        String dayName = "" ;

        switch(day)
        {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thusday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Wrong input,Please try again.");
        }
          
        System.out.println("The day is "+dayName+".");

    }
}