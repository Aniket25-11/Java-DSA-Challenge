import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle :");
        float p = sc.nextFloat();

        System.out.println("Enter Interest :");
        float r = sc.nextFloat();

        System.out.println("Enter Time :");
        float t = sc.nextFloat();

        float sInterest = (p*r*t)/100;

        System.out.println("Principle: " + p);
        System.out.println("Interest: " + r);
        System.out.println("Time: "+ t);

        System.out.println("Simple Interest: "+ sInterest);
    }
}
