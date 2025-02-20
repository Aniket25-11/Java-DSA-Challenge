import java.util.Scanner;



class Algebra{

    Algebra(){
        System.out.println("Constructor of Algebra Class Called");
    }


     int add(int a, int b){
        int ans = a + b;
        return ans;`
     }
}


public class Main {
    public static void main(String[] args) {
    //     Algebra obj = new Algebra();
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.println("Sum of Input numbers :- ");
    //     int ans = obj.add(a, b);
    //     System.out.println(ans);

    // Standard Library Methods 
    // 1. ceil(), 2. sqrt(), 3. floor()
    System.out.println(Math.sqrt(24));
    System.out.println(Math.sqrt(16));

    System.out.println(Math.floor(5.3));
    System.out.println(Math.floor(5.8));

    System.out.println(Math.ceil(5.3));
    System.out.println(Math.ceil(5.8));


    }


    
    
}
