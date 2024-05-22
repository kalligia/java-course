package gr.aueb.cf.ch4;

/**
 * εκτυπώνει 10 γραμμες από *
 * σε αυξουσα σειρά
 */
public class Stars10Asc {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
