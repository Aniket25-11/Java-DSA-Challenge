import java.util.*;

public class Student {
    int roll_no;
    String studentName;
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.roll_no = 1;
        obj1.studentName = "Rohan";
        System.out.println(obj1.roll_no);
        System.out.println(obj1.studentName);

        Student obj2 = new Student();
        obj2.roll_no = 2;
        obj2.studentName = "Pratiksha";
        System.out.println(obj2.roll_no);
        System.out.println(obj2.studentName);
    }
    
}
