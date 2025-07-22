
// Employee.java
public class Employee {
    // Private instance variables
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.employee_id = id;
        this.employee_name = name;
        this.employee_salary = salary;
    }

    // Getter for employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    // Setter for employee_id
    public void setEmployeeId(int id) {
        this.employee_id = id;
    }

    // Getter for employee_name
    public String getEmployeeName() {
        return employee_name;
    }

    // Setter for employee_name
    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    // Getter for employee_salary (formatted string)
    public String getEmployeeSalary() {
        return String.format("₹ %.2f", employee_salary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp = new Employee(101, "Pratiksha Bhosale", 55000.75);

        // Display initial details
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: " + emp.getEmployeeSalary());

        // Update ID and Name
        emp.setEmployeeId(102);
        emp.setEmployeeName("Pratiksha Gahininath");

        // Display updated details
        System.out.println("\n--- After Update ---");
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: " + emp.getEmployeeSalary());
    }
}
:
