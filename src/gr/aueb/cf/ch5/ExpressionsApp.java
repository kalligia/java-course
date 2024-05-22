package gr.aueb.cf.ch5;

public class ExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.8F;
        double doubleNum = 12.8;

        float resultFloat = 0;
        double resultDouble = 0;

        resultFloat = floatNum + intNum; // int, long, short, byte promotes to float
        resultDouble = doubleNum + floatNum + intNum;

        System.out.printf("Result float: %06.2f\n", resultFloat);
        System.out.printf("Result double: %08.3f", resultDouble);
    }
}
