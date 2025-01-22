import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the  num to start : ");
        int start = in.nextInt();
        System.out.println("Enter the  num to end : ");
        int end = in.nextInt();

        for (int i = start; i <= end; i=i+10) {
            System.out.println(i);
        }

    }
}
