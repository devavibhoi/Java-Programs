class J17AlphabetOrNot
{
   public static void main(String[] args) 
   {
      char ch ='A';
      String str = ((ch>=65 && ch<=90)||(ch>=97 && ch<=122))?(ch+" is a Alphabets."):(ch+" is not a Alphabets.");

    System.out.println(str);
   }
}