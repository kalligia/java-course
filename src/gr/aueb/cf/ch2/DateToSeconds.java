package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateToSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60*60;
        final int SECS_PER_DAY = 24*60*60;
        int totalSeconds = 0;
        int days = 0;
        int hours = 0;
        int mins = 0;
        int seconds = 0;

        System.out.println( "Give me the days" );
        days = input.nextInt();
        System.out.println( "Give me the hours" );
        hours = input.nextInt();
        System.out.println( "Give me the minutes" );
        mins = input.nextInt();
        System.out.println( "Give me the seconds" );
        seconds = input.nextInt();

        totalSeconds = (days * SECS_PER_DAY) + (hours *SECS_PER_HOUR) + (mins * SECS_PER_MINUTE) + (seconds);

        System.out.println(totalSeconds);




    }
}
