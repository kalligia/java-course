package gr.aueb.cf.ch5;

public class SumOfDigitsApp {

    public static void main(String[] args) {
        int num = 1345679;
        int sumOfDigits = 0;

        sumOfDigits = getSumOfDigits(num);

        System.out.println(num + " has sum of digits: " + sumOfDigits);
    }

    /**
     * Gets the sum of digits of th input number.
     *
     * @param num
     * @return
     */
    public static int getSumOfDigits(int num){
        int left = num;
        int rightDigit = 0;
        int sum = 0;

        do {
            rightDigit = left % 10;
            sum += rightDigit;
            left = left / 10;
        } while (left != 0);
        return sum;
    }
}
