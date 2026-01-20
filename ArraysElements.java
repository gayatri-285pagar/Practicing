public class ArraysElements{
    public static void main(String[] args){
        
        // 1. Declare and initialize an array of integers 
        int[] numbers = {1, 2, 3, 4, 5};   // ===> Static initialization
        int[] a = new int [5];             // ===> Dyanamic initialization

        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        
        // 2. Access and print each element using a loop
        System.out.println("Array elements are:");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        
        // 3. Access a single element directly
        System.out.println("1st element is: " + a[0]);
        System.out.println("2nd element is: " + a[1]);
        System.out.println("3rd element is: " + a[2]);
        System.out.println("4th element is: " + a[3]);
        System.out.println("5th element is: " + a[4]);
    }
}