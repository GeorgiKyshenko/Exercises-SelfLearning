package Testing_CopyContructor;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setAge(28);

        Employee employee1 = new Employee(employee);

        Employee employee2 = Employee.copy();

        System.out.println("Name: " + employee.getName() + ", age: " + employee.getAge());
        System.out.println("Name: " + employee1.getName() + ", age: " + employee1.getAge());
        System.out.println("Name: " + employee2.getName() + ", age: " + employee2.getAge());
    }
}
