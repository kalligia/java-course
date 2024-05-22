package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');
        int posOfNexto = s.indexOf("or", 2);
        System.out.println(positionOfo);
        System.out.println(posOfNexto);

        String odToEnd = s.substring(1);
        System.out.println(odToEnd);

        String od = s.substring(1,3);
        System.out.println(od);
    }
}
