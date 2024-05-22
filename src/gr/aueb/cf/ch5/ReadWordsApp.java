package gr.aueb.cf.ch5;

import java.io.IOException;

/**
 * Διαβάζει διαδοχικά λέξεις και κενά
 * μέχρι να βρει το #
 */
public class ReadWordsApp {

    static boolean isHash = false;
    static char ch = ' ';
    public static void main(String[] args) throws IOException {

        do {
            consumeWord();
            System.out.println();
            consumeSpaces();
        }
        while (!isHash);
    }

    public static void consumeWord() throws IOException {
        while((ch = (char) System.in.read()) != ' ') {
            if (ch == '#') {
                isHash = true;
                break;
            }
            System.out.println(ch + " ");
        }
    }

    public static void consumeSpaces() throws IOException {
        while ((ch = (char) System.in.read()) != ' ')
        {
            if (ch == '#') {
                isHash = true;
                break;
            }
            if (!isHash) System.out.println(ch + " ");
        }
    }
}
