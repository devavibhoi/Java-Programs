class J08SumOfDigits 
{
    public static void main(String[] args) {
        
        int num = 7634;
        int dup = num;// dup will not change if num change 
        int sum = 0;

        int rem = num % 10; //7634%10-->4
            sum = sum + rem; // 0+4-->4
            num = num / 10; //7634/10-->763

            rem = num % 10;//763&10-->3
            sum = sum + rem;//4+3-->7
            num = num / 10;//763/10-->76

            rem = num % 10;//76&10-->6
            sum = sum + rem;//7+6->13
            num = num / 10;//76/10-->7

            rem = num % 10;//7&10-->7
            sum = sum + rem;//13+7-->20
            num = num / 10;//7/10-->0

        System.out.println("The sum of "+dup +" digits is "+sum);
    }
    
}
