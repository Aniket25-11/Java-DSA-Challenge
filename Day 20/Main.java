import java.util.*;

class ArraysExample{

    void multiArrays(){
        // int[][] arr_1= new int [5][3];  // 1 Method
        // int[][] arr_1 = {{56, 43, 6}, {34, 7, 8}, {12, 56, 8}}; //2nd Method

        int[][] arr = {{56, 43, 6}, {34, 7, 8}};

        for(int i = 0; i<2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);
            }
        }





        // System.out.println(arr_1[0][0]); //56
        // System.out.println(arr_1[0][1]); //43
        // System.out.println(arr_1[0][2]); //6

        // int[][][] arr_3 = new int[5][3][2]; // 5 * 3 * 2 = 30
        // arr_3[0][0][0] = 1;
    }

    void demoArrays(){
        int[] ages = new int[3]; // ages[0], ages[1], ages[2]
        float[] weights = new float[3];
        // String[] names = new String[3];  
        String[] names = {"Aniket", "Nisha", "Amrapali", "Ojas"} ;
        // System.out.println(ages.length); // 3
        // System.out.println(weights.length); // 3
        // System.out.println(names.length); // 4

        
        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;
        // ages[5] = 45; // Error - out of bounds

        // Using For Loop :-
        // Method 1 :- 
        for(int i = 0; i < 3; i++){
            // System.out.println("By For Loop - Method 1");
            System.out.println(ages[i]);
        }
        
        // Method 2 :- 
        for(int age : ages){
            // System.out.println("By For Loop - Method 2");
            System.out.println(age);
        }
        
        // Using While Loop :- 
        int i = 0;
        while(i < 3){
            // System.out.println("By While Loop ");
            System.out.println(ages[i]);
            i++;
        }

        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
    }
}


public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
    }
}
