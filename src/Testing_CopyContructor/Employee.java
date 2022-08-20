package Testing_CopyContructor;

public class Employee {

    private String name;
    private int age;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
