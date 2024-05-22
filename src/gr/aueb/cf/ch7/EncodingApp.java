package gr.aueb.cf.ch7;

public class EncodingApp {

    public static void main(String[] args) {
        String s = "String to be encoded";
        String encodedS = " ";

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);

            encodedS += (char)(value + 1);
        }

        System.out.println(encodedS);
    }
}
