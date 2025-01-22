import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the reverse num to start : ");
        int start = in.nextInt();
        System.out.println("Enter the reverse num to end : ");
        int end = in.nextInt();

        for (int i = start; i >= end; i--) {
            System.out.println(i);
        }

    }
}
