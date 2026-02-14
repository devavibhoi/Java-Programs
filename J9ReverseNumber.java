class J9ReverseNumber
{
    public static void main(String[] args) 
    {
      int num = 234;
      int dup = num;
      int rev = 0;

      int rem = num%10;//234-->4
          rev = (rev*10)+rem;//(0*10)+4-->4
          num = num/10;//234/10-->23

          rem = num%10;//23%10-->3
          rev = (rev*10)+rem;//(4*10)+3-->43
          num = num/10;//23/10-->2

          rem = num%10;//2%10-->2
          rev = (rev*10)+rem;//(43*10)+2-->432
    
    System.out.println("The Reverse of "+dup +" digits is "+rev);
    }
}