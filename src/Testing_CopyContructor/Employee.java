package Testing_CopyContructor;

public class Employee {

    String name;
    int age;

    public Employee() {
        name = "Petko";
        age = 20;
    }

    public Employee(Employee employee) {
        this.name = employee.name;
        this.age = employee.age;
    }

    public static Employee copy() {
        return new Employee();
    }
}
