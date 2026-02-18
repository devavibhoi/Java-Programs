public class J60Arrays {
    
    public static void main(String[] args) {
        
        //Printing array type 1
       {
        int[]arr2=new int[1];
        int arr1[]= new int[3];
        arr1[0]=0001;
        arr1[1]=0002;
        arr1[2]=0003;

        System.out.print("Array 1 = ");
        System.out.print(arr1[0]+", ");
        System.out.print(arr1[1]+", ");
        System.out.println(arr1[2]+".");
       }
        System.out.println();
        System.out.println();
        

  //Printing array type 2
       
      {
        String[] name={"Avi","Ved","Parth","Yogesh","Kesri","Sanket","Bhavesh","Swami","Mayur","Akshay"};
        System.out.print("Array 2 Frineds name = ");
        for(int i=0 ;i<name.length;i++)
        {
            System.out.print(name[i]+", " );
            
        }
       }
System.out.println();
System.out.println();


  //finding length of an array
     {
       //array length go from 0th to length-1
       
        int[] arr1={0,2,6,3,8,34,7,0,3,8,43};

        System.out.print("Array 3 ");
        System.out.println("Length of the array is : "+arr1.length);

     }
    }
}
    
