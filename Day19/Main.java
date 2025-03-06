package Day19;
import java.util.*;

// Scope of variables **************

// Example 1 :- 
public class Main {
    public static void main(String[] args) {
        int z = 10;
        // int z = 12; // Same name of variables can't be store in the same scope. Therefore, Its showing error !

    }
}

// Example 2 :- 
class Algebra{
    int a = 10; //Member Variables
    int b = 5;

    int add(){
        return a + b;
    }
}


public class Main {
    public static void main(String[] args) {
        int a = 10;
    }
}

// 2. Method level of Scope 
class Algebra1{
    int a = 10; //Member Variables
    int b = 5;

    int add(){
        int a = 20;
        int b = 25;
        return a + b;
    }
}


// 3. Block Level Scope of Variables :-
// Def:- We can access variables only inside the block . 

// void demo(){
//     int a = 10;
//     System.out.println(a);

//     System.out.println(b);
//     {
//         int b = 10;  // we can only access b here !
//     }
// }


// 4. Formal Parameters and Actual Parameters 
// ** Formal Parameters :- Which can defined during function definition.
// It is also called as Just Parameters

// ** Actual Parameters :- When will call any function and at the time of passing that parameters are called as Actual parameters. 
// It is also called as Arguments. 


// 5. Pass by Values & Pass by Reference. 





// ***** This is the most Boring Topic *****


