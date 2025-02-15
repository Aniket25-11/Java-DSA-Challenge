import java.util.*;

// Print 1 to N 
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        while(num <= n){
            System.out.println(num);
            num ++; // num ++ is equivalent to num = num + 1
        }
    }
    
}
