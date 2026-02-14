class J10PalindromeNumber 
{
    public static void main(String[] args) 
    {
      // meaning its digits stay the same when reversed,Eg 121,1881.
      
       int num = 1881;
      int dup = num;
      int rev = 0;//Reverse

      int rem = num%10;
          rev = (rev*10)+rem;
          num = num/10;

          rem = num%10;
          rev = (rev*10)+rem;
          num = num/10;

          rem = num%10;
          rev = (rev*10)+rem;
          num = num/10;

          rem = num%10;
          rev = (rev*10)+rem;

        if(rev==dup)
        {
            System.out.println(dup+ " is a Palindrome.");
        }
        else
        {
            System.out.println(dup+ " is not a Palindrome.");
        }
    }
}
