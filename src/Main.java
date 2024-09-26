import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String trash = "";
        int age = 0;

        System.out.println("Enter your age: ");

        age = console.nextInt();
        console.nextLine(); // clears buffer
        if(age >= 21)
        {
            System.out.println("You get a wristband!");
        }
    }
}