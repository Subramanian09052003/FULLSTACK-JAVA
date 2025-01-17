public class Paraconstructor {
    int empid;        
    String empname;   
    int empage;       
    double empsalary; 

    public Paraconstructor(int a, String b, int c, double d) {
        empid = a;
        empname = b;
        empage = c;
        empsalary = d;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + empid);
        System.out.println("Name: " + empname);
        System.out.println("Age: " + empage);
        System.out.println("Salary: " + empsalary);
    }

    public static void main(String[] args) {
        Paraconstructor e = new Paraconstructor(1, "Ashwin ", 21, 50000);

        e.display();
    }
}
