class J04LocalGlobalVariable
{
    
    public static void main(String[] args) 
    {
        //Global Variable

        int global = 20; 

        
            System.out.println("Global Variable is "+global);
            System.out.println("It is through out the class block.");

        
        System.out.println("Global can declare outside anywhere as well "+global);
       
    

         //Local Variable
            
          {
            int local = 10;

            System.out.println("Loacal variable is "+local);
            System.out.println("It is only with in the block,declare other than class block.");
            System.out.println();
          }
           //System.err.println(+local); CTE -->> can't find symbol.

        //Static Variable 
        {
            System.out.println("Variable prefixed with static keyword");
       
        }
        
        //NonStatic Variable 
       {
            System.out.println("Variable not prefixed with static keyword");
       }
    }
}
