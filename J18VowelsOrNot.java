class J18VowelsOrNot
{
    public static void main(String[] args) 
    {
       char ch = 'e';
       String str = ( (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') || ( ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))?(ch+" it is a vowel."):(ch+" it is a consonent"); 
       
    System.out.println(str);
    }
}