import java.util.*;

// print the First N factorial Numbers 
public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Fact = 1;

        for (int i = 1; i <= n; i++){
            Fact = Fact * i;
            System.out.println("Factorial of " + i + " : " + Fact);
        }
    }
}
