import java.util.Scanner;
class Addition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        int add = a+b;
        System.out.println("Addition is :" +add);
    }
}

/**
 * 
cd D:\Practicing                         # Go to your project folder
git add .                                # Stage all new/changed files
git commit -m "Your commit message"      # Commit with a message
git push --set-upstream origin main      # First-time push only
git push                                 # Future pushes (after upstream is set)

 **/