import java.util.Scanner;

public class divby4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num % 4 == 0) {
            
            System.out.println(num + " is divisible by 4");
        }
        else {
            System.out.println(num + " is not divisible by 4");
        }

       
    }
}
