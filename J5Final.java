class JFinalublic 
{
    public static void main(String[]args)
    {
         // we can't perform operation on two byte value and store it to byte
    //      ,but we can store it in byte if the values are constants.
    //     byte d = 25;
    //     byte e = 25;
    //     byte f = d+e;
    //     System.out.println(f);
    //     //CTE--> can not convert from int to byte
    }
    
    {
        final byte a = 25;
        final byte b = 25;
              byte c = a+b;
        System.out.println(c);
        
   
    }
}
