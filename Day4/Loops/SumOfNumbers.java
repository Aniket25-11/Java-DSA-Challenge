import java.util.*;

// Sum of N natural Numbers 
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;

        while(num <= n) {
            sum = sum + num;
            num ++;

        }
        System.out.println(sum);
    }
}
