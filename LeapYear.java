import java.util.Scanner;

class  LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if(year % 400 == 0 ||( year % 4 == 0 && year % 100 != 0) )
        {
            System.out.println("Year is leap year");
        }else{
             System.out.println("Year is not leap year");
        }
    }
}