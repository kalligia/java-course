package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * λαμβάνει έναν ακέραιο που συμβολίζει δευτερόλεπτα και μετατρέπει
 * σε ημέρες, ώρες, λεπτά, δευτερόλεπτα
 */
public class SecondsToDate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60*60;
        final int SECS_PER_DAY = 24*60*60;
        int totalSeconds = 0;
        int days = 0;
        int hours = 0;
        //    int remHours = 0;
        int mins = 0;
     //   int remMins = 0;
        int seconds = 0;
        int remSecs = 0;

        System.out.println( "Give me the seconds" );
        totalSeconds = input.nextInt();

        days = totalSeconds / SECS_PER_DAY;
        remSecs = totalSeconds % SECS_PER_DAY;

        hours = remSecs / SECS_PER_HOUR;
        remSecs = remSecs % SECS_PER_HOUR;

        mins = remSecs / SECS_PER_MINUTE;
        remSecs = remSecs % SECS_PER_MINUTE;


//        mins = totalSeconds /60;
//        seconds = totalSeconds % 60;
//        hours = mins /60;
//        remMins = mins % 60;
//        days = hours / 24;
//        remHours = hours % 24;

     //   System.out.printf("%d days, %d hours, %d minutes, %d seconds", days, remHours, remMins, seconds);
        System.out.printf("%d days, %d hours, %d minutes, %d seconds", days, hours, mins, remSecs);

;   }
}
