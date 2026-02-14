class J20NumberDivisibleBy2And5
{
   public static void main(String[] args) 
   {
      int num = 20;
      
      if(num%2==0 && num%5==0)
      {
        System.out.println("The number "+num +" is divisible by 2 and 5.");
      }
      if(num%2==0 && !(num%5==0))
      {
        System.out.println("The number "+num +" is divisible by 2.");
      }
      if(num%5==0 && !(num%2==0))
      {
        System.out.println("The number "+num +" is divisible by 5.");
      }
   }
}