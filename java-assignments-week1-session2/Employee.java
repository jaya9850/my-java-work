public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.id = 101;
        emp.age = (int) 35.5;  // Type casting from double to int
        emp.name = "Sneha";
        emp.isPermanent = true;

        System.out.println("Successfully started");
    }
}
