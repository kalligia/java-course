package gr.aueb.cf.ch5;

/**
 * Demonstrates overloading (υπερφόρτωση).
 * Ίδιο όνομα μεθόδου, διαφορετικές τυπικές παράμετροι.
 * Method signature = όνομα μεθοδου + τυπικές παράμετροι
 */
public class OverloadingApp2 {

    public static void main(String[] args) {

        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = add(1,2);
        sum3 = add(1,2,3);
        sum4 = add(1,2,3,4);

        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }

    /**
     * Adds two integers.
     *
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     *
     * Adds three integers.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Adds four integers.
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
