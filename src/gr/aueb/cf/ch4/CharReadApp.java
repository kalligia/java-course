package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Demo of reading a char.
 * 1.System.in.read()
 */
public class CharReadApp {

    public static void main(String[] args) throws IOException {
        int inputChar1 = ' ';
        int inputChar2 = ' ';
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an ASCII char");
        inputChar1 = System.in.read();

        System.out.println("char: " + (char) inputChar1);
        System.out.println("ordinal: " + inputChar1);

        System.out.println("Please insert a Unicode char");
        inputChar2 = in.nextLine().charAt(0);
        System.out.println("Unocode char: " + inputChar2);
    }
}