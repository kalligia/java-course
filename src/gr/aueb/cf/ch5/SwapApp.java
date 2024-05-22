package gr.aueb.cf.ch5;

/**
 * Ανταλλάσσει αμοιβαία δυο ακεραίους.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);

        swap(a,b);
        System.out.println(a);
        System.out.println(b);

    }

    /**
     * Mutually interchanges the value of two ints.
     *
     * @param a   the first int
     * @param b   the second int
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
