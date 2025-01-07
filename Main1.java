import java.util.Scanner;
public class Main1
{
    public static void main(String args[])
 {
int a,b;
System.out.println("Enter 2 Nos : ");
Scanner in =new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();



System.out.println("Addition is : "+((a+b)));
System.out.println("subtraction is : "+((a-b)));
System.out.println("multiplication is : "+((a*b)));
System.out.println("division is : "+((a/b)));
System.out.println("modulus is : "+((a%b)));
}
}
