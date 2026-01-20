public class ArraysElements{
    public static void main(String[] args){
        
        // 1. Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        // 2. Access and print each element using a loop
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        // 3. Access a single element directly
        System.out.println("First element is: " + numbers[0]);
    }
}