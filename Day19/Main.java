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