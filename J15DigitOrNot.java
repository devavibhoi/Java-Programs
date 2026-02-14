class J15DigitOrNot
{
   public static void main(String[]args)
    {
        char num = '5';


        String str = ((num>=48&&num<=57))?(num+" It is a Number"):(num+" It is not a number");//Ascii value for 48 between 57.
        System.out.println(str);
    }
}