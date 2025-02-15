import java.util.*;

public class Conditional_Operator_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value % 2 == 0 && value % 3 == 0) {
            System.out.println("Found Ans - " + value);
        } else{
            System.out.println("Condition False");
        }
    }
    
}
