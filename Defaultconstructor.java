public class Defaultconstructor{
    int a; 
    int b; 

    public Defaultconstructor() {
        a = 110; 
        b = 28; 
    }

    public int add() {
        return a + b;
    }

    public static void main(String[] args) {
        Defaultconstructor ob1 = new Defaultconstructor();

        int result = ob1.add();
        System.out.println("The sum of " + ob1.a + " and " + ob1.b + " is: " + result);
    }
}
