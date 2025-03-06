
public class BitwiseOperators {
    public static void main(String[] args) {
        int p = 9, q = 10;

        System.out.println(p | q); //11 Bitwise OR
        System.out.println(p & q); //8 Bitwise AND
        System.out.println(p ^ q); //3 Bitwise XOR

        System.out.println(p << 1); //18 Left Shift
        System.out.println(p << 2); //36 Left Shift

        System.out.println(q >> 1); //5 Right Shift
        System.out.println(q >> 2); //2 Right Shift
    }
}
