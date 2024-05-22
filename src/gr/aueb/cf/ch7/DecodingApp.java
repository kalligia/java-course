package gr.aueb.cf.ch7;

public class DecodingApp {

    public static void main(String[] args) {
        String s = "Tusjoh!up!cf!efdpefe";
        String decodedS = " ";

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);

            decodedS += (char)(value - 1);
        }

        System.out.println(decodedS);
    }
}
