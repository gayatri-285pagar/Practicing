
import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("b");
        int b = sc.nextInt();

        int calculate = 0;

        System.out.println("Choose operation (+, -, *, %): ");
        char choice = sc.next().charAt(0);

        switch(choice)
        {
            case '-': 
                     calculate = a-b;
                     break;

            case '+': 
                     calculate = a+b;
                     break;
            case '%':
                     calculate = a%b;
                     break;
            case '*':
                     calculate = a*b;
                     break;
           
        }
         System.out.println("result = "+calculate);
    }
}