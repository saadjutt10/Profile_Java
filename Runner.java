public class Runner{
    public static void main(String[] args) {
        Profile p1=new Profile("Muhamamd", "Saad", 19, "SIalkot Pakistan", (float)5.5);
        Student s1=new Student(new int[]{65,90,86,100,89} , p1);
        Profile p2=new Profile("Muhamamd", "Zoraiz", 29, "Lahore Pakistan", 6);
        Employee e1=new Employee(50000, p2);

        System.out.println(s1);
        System.out.println(e1);
    }
}