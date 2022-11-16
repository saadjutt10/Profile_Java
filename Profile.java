public class Profile{
    String name;
    String Fname;
    int age;
    String address;
    float height;


    public Profile(String name, String fname, int age, String address, float height) {
        this.name = name;
        Fname = fname;
        this.age = age;
        this.address = address;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Profile [name=" + name + ", Fname=" + Fname + ", age=" + age + ", address=" + address + ", height="
                + height + "]";
    }
    
    
}