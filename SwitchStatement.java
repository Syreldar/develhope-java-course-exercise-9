import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Input a number between 1 and 10:");
            int number = scanner.nextInt();

            switch (number)
            {
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                case 3 -> System.out.println("three");
                case 4 -> System.out.println("four");
                case 5 -> System.out.println("five");
                case 6 -> System.out.println("six");
                case 7 -> System.out.println("seven");
                case 8 -> System.out.println("eight");
                case 9 -> System.out.println("nine");
                case 10 -> System.out.println("ten");
                default -> {
                    System.out.println("Cannot give you the name.");
                    return; // Automatically exit from switch and loop when inputting a number not in range.
                }
            }
        }
    }
}
