import java.util.*;

// Print Hollow Rectangular Pattern with spaces
public class HollowRectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= c; j++) {
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("* "); // Here is the space after star "*"
                } else {
                    System.out.print("  "); // Here are 3 spaces 
                }
            }
            System.out.println();
        }
    }
}
