public class AssignmentOperators {
    public static void main(String[] args) {
        int p = 10;
        int q;

        // = --> Equal to
        q = p;
        System.out.println(q); //10

        // +=
        p += q; // p = p + q, p = 10 + 10 = 20
        System.out.println(p);

        // -=
        p -= q; // p = p- q, p = 10 - 10 = 0
        System.out.println(p);

        // /=
        p /= q; // p = p / q, p = 10 / 10 = 1
        System.out.println(p);

        // *=
        p *= q; // p = p * q, p = 10 / 10 = 100
        System.out.println(p);


    }
}
