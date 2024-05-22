package gr.aueb.cf.ch4;

/**
 * Υπολοξίζει το άθροισμα και το γινόμενο
 * των 10 πρώτων αριθμών από 1 εως 10
 */
public class SumMulFor {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }
        System.out.println(mul);
        System.out.println(sum);
    }
}
