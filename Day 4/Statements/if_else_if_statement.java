import java.util.Scanner;

public class if_else_if_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age <= 12) {
            System.out.println("Child");
        } else if (age > 12 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }
    
}
