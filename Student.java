import java.util.Arrays;

public class Student {
    int[] marks;
    Profile p1;

    public Student(int[] marks, Profile p1) {
        this.marks = marks;
        this.p1 = p1;
    }

    float calcGPA(int[] m) {
        float total = 0;
        for (int i = 0; i < m.length; i++) {
            total += m[i];
        }
        // We need to first calculate the percentage on which base we can define
        // criteria for our GPA
        // Considering the total subjects are 5 with each with total 100 marks
        System.out.println(total);
        float percentage = total / 500 * 100;
        System.out.println(percentage);
        // Now returning the GPA obtanied by student on percentage basis
        if (percentage >= 90) {
            return (float)4;
        } else if (percentage >= 85 && percentage < 90) {
            return (float)3.5;
        }else if (percentage >= 75 && percentage < 85) {
            return (float)3;
        }else if (percentage >= 65 && percentage < 75) {
            return (float)2.5;
        }else if (percentage >= 55 && percentage < 65) {
            return (float)2;
        }else if (percentage >= 50 && percentage < 55) {
            return (float)1;
        }else{
            System.out.println("You falied in your examinaion");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student [marks=" + Arrays.toString(marks) + ", p1=" + p1 + ", GPA" + this.calcGPA(marks) +"]";
    }

}