package gr.aueb.cf.ch7;

public class TraverseWithSubstringApp {

    public static void main(String[] args) {
        String s = "Athens";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i, i+1));
        }
    }
}
