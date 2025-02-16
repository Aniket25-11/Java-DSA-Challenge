import java.util.*;

// Print Pyramid Pattern 
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++){ //Traversing Over Rows

            // Print r-i spaces
            for(int j = 1; j <= r; j++) {
                System.out.println(" ");
            }

            // Print (2*i - 1) stars
            for (int k = 1; k <= 2*i-1; k++){
                System.out.println("*");
            }

            System.out.println();

        }
    }
    
}
