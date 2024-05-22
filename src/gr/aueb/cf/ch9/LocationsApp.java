package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LocationsApp {

    public static void main(String[] args) {
        File inFd = new File("C:/tmp/locations.txt");
        File outFd = new File("C:/tmp/locations-out.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(",");

                if (!line.equals("Location,Latitude,Longitude"))
                 {
                    ps.printf("{ location: '%s', latitude: %s, longitude: %s }", tokens[0], tokens[1], tokens[2]);
                    ps.flush();
                    ps.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
