import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // question 1
        System.out.print("(Q1). Enter a number to obtain the factorial of: ");
        System.out.println("(A1). The factorial is: " + getFactorial(Integer.valueOf(scanner.nextLine())) + "\n");

        // question 2
        System.out.print("(Q2). Enter a number that should be used as the base: ");
        double base = Double.valueOf(scanner.nextLine());
        System.out.print("(Q2). Enter a number that should be used for the exponent: ");
        double exponent = Double.valueOf(scanner.nextLine());
        System.out.println("(A2). " + base + " to the power of " + exponent + " is equal to: " + getExponentValue(base, exponent) + "\n");

        /*
         question 3

         notes: slope is calculated by rise over run

         y - 24 = 24(0 - 12)  - point slope
         */
        double x1, y1, x2, y2;
        System.out.print("(Q3). Enter x1: ");
        x1 = scanner.nextDouble();
        System.out.print("(Q3). Enter y1: ");
        y1 = scanner.nextDouble();
        System.out.print("(Q3). Enter x2: ");
        x2 = scanner.nextDouble();
        System.out.print("(Q3). Enter y2: ");
        y2 = scanner.nextDouble();
        double[] a = {x1, y1};
        double[] b = {x2, y2};
        double deltaX = b[0] - a[0]; // 1
        double deltaY = b[1] - a[1]; // 24
        double slope = deltaY / deltaX;

        double yIntercept = (slope * (0 - a[0])) + a[1];
        System.out.println("(A3). Y Intercept: " + yIntercept + "\n");
        // 24 = 24(12)+b

        System.out.println("(A4). Linear Equation: y=" + slope + "x+" + yIntercept);
    }

    public static double getExponentValue(double base, double pow) {
        double result = base;
        for (double i = 0; i < pow -1; i++) {
            result = result * base;
        }
        return result;
    }

    public static int getFactorial(int integer) {
        int times = 1;
        for (int i = 1; i < integer + 1; i++) {
            times = times * i;
        }
        return times;
    }
}
