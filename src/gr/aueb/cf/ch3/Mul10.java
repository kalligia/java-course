package gr.aueb.cf.ch3;

/**
 * Υπολογίζει 1*2*3+...*10
 */
public class Mul10 {
    public static void main(String[] args) {
        int i = 1;
        int mul = 1;

        while (i <= 10) {
            mul = i * mul;
            i++;
        }
        System.out.println(mul);
    }
}
