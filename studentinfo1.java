

import java.util.Scanner;

public class studentinfo1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter  roll number:");
        int rollNo = in.nextInt();

        in.nextLine(); 

        System.out.println("Enter  name:");
        String name = in.nextLine();

        System.out.println("Enter standard:");
        String standard = in.nextLine();

        System.out.println("Enter section:");
        String section = in.nextLine();

        
        System.out.println("Enter marks 1:");
        int mark1 = in.nextInt();

        System.out.println("Enter marks 2:");
        int mark2 = in.nextInt();

        System.out.println("Enter mark 3:");
        int mark3 = in.nextInt();

        System.out.println("Enter marks 4:");
        int mark4 = in.nextInt();

        System.out.println("Enter marks 5:");
        int mark5 = in.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        int average = total / 5;

        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Standard: " + standard);
        System.out.println("Section: " + section);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3 + ", " + mark4 + ", " + mark5);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

    }
}