public class RandomSquares {
    // input a number in the range from 1 to 9;

    public static void someSquares(int n, double x, double y, double length) {
        if (n > 0) {
            for (double i = 0; i < length * 4; i = i + length * 2) {
                for (double j = 0; j < length * 4; j = j + length * 2) {
                    double r = Math.random();
                    if (r < 0.25) {
                        int[] red = { 255, 255, 255, 51, 51, 51, 51, 153, 255 };
                        int[] green = { 51, 153, 255, 255, 255, 153, 51, 51, 51 };
                        int[] blue = { 51, 51, 51, 51, 153, 255, 255, 255, 153 };

                        StdDraw.setPenColor(red[n - 1], green[n - 1], blue[n - 1]);

                        StdDraw.filledSquare(x + i + length, y + j + length, length);
                    }
                    else {
                        someSquares(n - 1, x + i, y + j, length / 2.0);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n > 0 && n < 10) {
            StdDraw.setXscale(-0, +1);
            StdDraw.setYscale(-0, +1);
            someSquares(n, 0.0, 0.0, 0.25);
        }
        else {
            System.out.println("Please enter a number in the range from 1 to 9");
        }

    }
}
