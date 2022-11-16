public class Employee{
    double salary;
    Profile p2;

    
    public Employee(double salary, Profile p2) {
        this.salary = salary;
        this.p2 = p2;
    }


    @Override
    public String toString() {
        return "Employee [salary=" + salary + ", p2=" + p2 + "]";
    }

    
}