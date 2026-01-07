
import java.util.Scanner;

class RigthAngleTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter n:");
         int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            //uguhn
    }
}