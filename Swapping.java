
import java.util.Scanner;
class Swapping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int temp = 0;

        System.err.println("Enter value for n:");
        int n = sc.nextInt();

        System.err.println("enter value for m:");
        int m = sc.nextInt();

    //     temp = n;
    //     n = m;
    //     m = temp;

            n = n+m;
            m = n-m;
            n = n-m;

        System.err.println("Swapping successful:");
        System.err.println("value for n:"+n);
        System.err.println("Value for m:"+m);

    }
}