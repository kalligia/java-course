package gr.aueb.cf.ch8;

import java.io.IOException;

public class MethodExceptionApp {

    public static void main(String[] args) {
        char ch = ' ';

        try {
            ch = readOneChar();
        } catch (IOException e) {
            System.out.println("Error. Cannot read a char.");
        }
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
