import java.util.*;

// sum of integers until user enters input as -1
public class DoWhileExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while(num != -1){
            sum = sum + num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
    
}
