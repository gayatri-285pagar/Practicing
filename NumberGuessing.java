
import java.util.Scanner;

class NumberGuessing
{
    public static void guessingNumberGame()
    {
       Scanner sc = new Scanner(System.in);
       int number = 1 + (int)(100 * Math.random());
       int k = 5;
       
       System.out.println("A number is chosen between 1 and 100.");;
       System.out.println("You have " + k + " attempts to guess the correct number.");

       for(int i = 0; i < k; i ++){
        System.out.println("enter you guess");
        int guess = sc.nextInt();

        if(guess == number){
            System.out.println("Your guessing number is correct. you are winner of the Game");
            sc.close();
            return;

        }
        else if (guess < number){
            System.out.println("The number is greater than " +guess);
        }
        else {
            System.out.println("The number is less than" +guess);
        }
     }
        System.out.println("You've exhausted all attempts. The correct number was: "+ number);
        sc.close();
       }

public static void main(String[] args)
    {
        guessingNumberGame();
    }
}