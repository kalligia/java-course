package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tempF = 0;
        int tempC = 0;

        System.out.println("Give me a temperature in Fahrenheit degrees");
        tempF = input.nextInt();

        tempC = 5*(tempF-32)/9;
        System.out.printf("This temperature is %d degrees Celsius", tempC);
    }
}
