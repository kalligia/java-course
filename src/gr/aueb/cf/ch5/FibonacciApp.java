package gr.aueb.cf.ch5;

/**
 * Υπολογίζει την ακολουθία Φιμπονάτσι
 * O επόμενος όρος είναι το άθροισμα των δύο προηγούμενων.
 */
public class FibonacciApp {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fibo(i));
        }
    }

    /**
     * Υπολογισμος με αναδρομή
     * @param n     the n-th Fibonacci term
     * @return      the Fibonacci term.
     */
    public static int fibo(int n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return fibo(n-1) + fibo(n-2);

    }
}
