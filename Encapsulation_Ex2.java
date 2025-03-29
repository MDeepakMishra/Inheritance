class Employee {
    private String empName;
    private double salary;

    // Setter Methods
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter Methods (void - just print values)
    public void getEmpName() {
        System.out.println("Employee Name: " + empName);
    }

    public void getSalary() {
        System.out.println("Employee Salary: $" + salary);
    }
}

public class Encapsulation_Ex2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Amit");
        emp.setSalary(50000);

        emp.getEmpName();
        emp.getSalary();
    }
}

