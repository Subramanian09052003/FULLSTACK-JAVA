import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number between 500 and 520: ");

        int num1 = in.nextInt();

        System.out.println("Enter the second number between 500 and 520: ");

        int num2 = in.nextInt();

        if (num1 >= 500 && num1 <= 520 && num2 >= 500 && num2 <= 520) {

            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } else {

            System.out.println("Invalid ");
        }

    }
}
