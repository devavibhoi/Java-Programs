class J7CountOfDigits
{
    public static void main(String[] args) 
    {
        int num = 7634;
        int count = 0;
        int rem ;

         rem = num%10; // 7634%10 --> 4
            count = count+1; //0+1 --> 1
            num = num/10; //7634/10 --> 763

            rem = num%10; //763%10 --> 3
            count = count+1; //1+1 --> 2
            num = num/10; //763/10 --> 76

            rem = num%10; //76%10 --> 6
            count = count+1; //2+1 --> 3
            num = num/10; //76/10 --> 7

            rem = num%10; //7%10 --> 7
            count = count+1; //3+1 --> 4

        System.out.println(count);    

    }
    
}
