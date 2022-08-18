package Testing_CopyContructor;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Ivan";
        employee.age = 28;

        Employee employee1 = new Employee(employee);

        Employee employee2 = Employee.copy();

        System.out.println("Name: " + employee.name + ", age: " + employee.age);
        System.out.println("Name: " + employee1.name + ", age: " + employee1.age);
        System.out.println("Name: " + employee2.name + ", age: " + employee2.age);
    }
}
