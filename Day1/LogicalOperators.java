public class LogicalOperators {
    public static void main(String[] args) {
        int p = 15, q = 10, r = 25;

        // && Operator 
        System.out.println((p > q) && (p > r));
        System.out.println((p > q) && (p < r));
        
        // || Operator 
        System.out.println((r < q) || (p < q));
        System.out.println((p > q) || (q < r));
        System.out.println((p < q) || (q < r));
        
        // ! Operator
        System.out.println (!(p == q));
        System.out.println (!(p > q));


    }
}
