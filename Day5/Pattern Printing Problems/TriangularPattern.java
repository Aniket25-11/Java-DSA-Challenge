import java.util.*;

// Triangular Pattern (Solid)
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        // int c = sc.nextInt(); There is no need of 2nd input or Column to print triangle 

        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
