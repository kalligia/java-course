package gr.aueb.cf.ch2;

public class DiceApp {

    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1; //i random dinei times 0 - 0,99 -> * 6 = 0 - 5,95 -> +1 = 1 - 6,95 -> int 1 -6
        int die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("(%d, %d)", die1, die2);


    }
}
