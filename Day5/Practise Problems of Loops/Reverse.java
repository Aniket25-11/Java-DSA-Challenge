import java.util.*;

// Reverse the input number like 12345 --> 54321
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;

        while(n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
