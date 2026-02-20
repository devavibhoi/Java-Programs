public class J64ForEachLoop {

    public static void main(String[] args) {
        

        int arr[]={10,20,30,40,50,60};
        int i=0;
        for (int element : arr) 
        {
            System.out.print("index "+i +"= ");
            i++;
            System.out.println(element);

        }
    }
}