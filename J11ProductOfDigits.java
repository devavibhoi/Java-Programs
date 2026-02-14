class J11ProductOfDigits 
{
    public static void main(String[] args) 
    {
      int num = 222;
      int dup = num;
      int mul = 1;//If take 0 will get final answer zero 
      
      int rem = num%10;//222%10-->2
          mul = mul*rem;//1*2-->2
          num = num/10;//222/10-->22

          rem = num%10;//22%10-->2
          mul = mul*rem;//2*2-->4
          num = num/10;//22/10-->2

          rem = num%10;//2%10-->2
          mul = mul*rem;//4*2-->8

        System.out.println("Product of "+dup +" is "+mul);
    }
    
}
