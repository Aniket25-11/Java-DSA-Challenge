import java.util.*;

// Sum of the input Number 
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int SumOfDigits = 0;
        int original_n = n;

        while(n > 0) {
            SumOfDigits += n % 10;
            n = n / 10;
        }

        System.out.println("Number Of Digits in " + original_n + " = " + SumOfDigits);
    }
}