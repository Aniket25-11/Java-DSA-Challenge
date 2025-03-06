import java.util.Scanner;

public class divisible_by_3_or_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value % 3 == 0 || value % 5 == 0) {
            System.out.println("Found Ans - " + value);
        } else{
            System.out.println("Condition False");
        }
    }
    
}
