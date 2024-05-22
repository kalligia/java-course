package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδόν ενός παραλληλογραμμου
 */
public class CalculateRectAreaApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.println("Give me width, height");
        width = in.nextDouble();
        height = in.nextDouble();

        area = calcArea(width,height);
        System.out.println("Area: " + area);
    }

    /**
     * Υπολογίζει το εμβαδόν ενός παραλληλογράμμου
     * @param width   το πλάτος
     * @param height  το ύψος
     * @return        επιστρέφει το εμβαδόν
     */
    public static double calcArea(double width, double height) {
        return width * height;
    }
}
