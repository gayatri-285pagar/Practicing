
import java.util.Scanner;

class MultiplicationTableGenerator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to generate Multiplication table :");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = num * i;
            System.out.print("\n"+table);
        }
    }
}