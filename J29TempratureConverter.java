import java.util.*;
class J29TempratureConverter
{
    public static void main(String[] args) 
    {
        System.out.println("**** temprature converter ****");
        System.out.println();
        System.out.println();

      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Temprature in °C : ");
      float cel = sc.nextFloat();

      System.out.println("1.Kelvin\n2.Faranite\n3.Rankine\n4.Reaumer ");
      byte option = sc.nextByte();
      System.out.println();

      if(option==1)
      {
        float kelvine = cel+273.15f;
        System.out.println(cel+"°C = "+kelvine+" k");
      }
      else if (option==2)
      {
        float faranite = (cel*9/5)+32f;
        System.out.println(cel+"°C = "+faranite+" f");
      }
      else if (option==3)
      {
        float rankine = (cel*(9/5))+491.67f;
        System.out.println(cel+"°C = "+rankine+" r");
      }
      else if (option==4)
      {
        float reaumer = (cel*4)/5f;
        System.out.println(cel+"°C = "+reaumer+" k");
      }
      else
      {
        System.out.println("Invalid input,Pleasr try again.");
      }
    }
}