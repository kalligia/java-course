package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int yearFinal = 0;

        System.out.println("Give me a day, a month and a year");
        day = input.nextInt();
        month = input.nextInt();
        year = input.nextInt();

        yearFinal = year % 100;

        System.out.printf("%02d/%02d/%02d", day, month, yearFinal);
    }
}
