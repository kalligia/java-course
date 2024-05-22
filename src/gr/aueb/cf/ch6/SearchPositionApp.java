package gr.aueb.cf.ch6;

public class SearchPositionApp {

    public static void main(String[] args) {

        int[] grades = {6,8,2,10};
        int position = -1;
        final int EXCELLENT = 10;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == EXCELLENT) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println("Found at position: " + (position+1));
        }
    }
}
