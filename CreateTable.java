
import java.util.Scanner;

class CreateTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter no:");
        int number= sc.nextInt();
        int table;

        for(int i = 1; i <= 10; i++){

           table = i*number;
            
            System.out.println(number + " * " + i + " = " + table);
        }
    }
}