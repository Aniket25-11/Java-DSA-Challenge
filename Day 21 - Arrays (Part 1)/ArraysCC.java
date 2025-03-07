import java.util.*;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new int[50]; // It is static, therefore we can't add 51th element (at runtime).
        Scanner sc = new Scanner(System.in);
        
        // int phy;
        // phy = sc.nextInt();

        System.out.println("Length of Array = " + marks.length);

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math

        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");
    }
}
