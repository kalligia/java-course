package gr.aueb.cf.ch5;

/**
 * Προσθέτει δυο ακεραίους
 * με την χρήση μεθόδου.
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = AddApp.add(a,b);

        System.out.println(result);
    }

    /**
     * Adds two integers.
     *
     * @param a    the first integer
     * @param b    the second integer
     * @return     the sum of the two integers
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
