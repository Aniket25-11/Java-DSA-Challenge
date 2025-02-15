import java.util.*;

// find the multiple of 5 and 7
public class Break_Keyword {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        int num = 1;

        while (true) {
            if((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("Found Answer: " + num);
                break;
            }
            num ++;
        }
    }
    
}
