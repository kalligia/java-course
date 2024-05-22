package gr.aueb.cf.ch4;

/**
 * εκτυπώνει 10 γραμμες από *
 * σε φθίνουσα σειρά
 */
public class Stars10Desc {

    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
