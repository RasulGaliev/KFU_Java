import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee implements Comparable<Employee>{
    private String name;
    private String position;
    private int salary;
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " - " + position + " - " + salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.salary - employee.salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Vladimir", "director", 100000);
        Employee employee2 = new Employee("Aleks", "manager", 50000);
        Employee employee3 = new Employee("Max", "developer", 80000);
        Employee employee4 = new Employee("Ali", "developer", 80000);
        Employee employee5 = new Employee("John", "team lead", 120000);
        Employee employee6 = new Employee("Boris", "cat", 5000);
        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5, employee6};
        out(employees);
        Arrays.sort(employees);
        out(employees);
        Arrays.sort(employees, new EmployeeComparator());
        out(employees);
    }
    public static void out(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println();
    }
}