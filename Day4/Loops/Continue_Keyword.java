import java.util.*;

// This is the program to print numbers except multiple of 3 till the 50
public class Continue_Keyword {
    public static void main(String[] args) {
        for (int num = 1; num <= 50; num ++){
            if (num % 3 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
    
}
