import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_n = n;

        while(n > 0) {
            n = n / 10;
            numOfDigits ++; //NumOfDigits = NumOfDigits + 1
        }
        System.out.println("Number Of Digits in " + original_n + " = " + numOfDigits);
    }
}
