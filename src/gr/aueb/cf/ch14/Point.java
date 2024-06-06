package gr.aueb.cf.ch14;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    private Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    /**
     * Public static factory methods -
     * they replace the single constructors
     * @return  a new point instance,
     * calling the default constructor
     */

//    public static Point getInstance() {
//        return new Point();
//    }

    public static Point getZeroPoint() {
        return new Point();
    }

    /**
     * Returns a random point 0 - 100
     * @return
     */
    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextInt(101), rnd.nextInt(101) );
    }
}
