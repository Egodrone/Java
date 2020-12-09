/**
 * @name Simple Java Calculator
 * @author Eddie Chernyshov
 */
package se.lexicon.eddie;

public class Operations {

    public int evStr(String a) {
        int g;
        if (a.indexOf("+") != -1) {
            g = a.indexOf("+");
        } else if (a.indexOf("-") != -1) {
            g = a.indexOf("-");
        } else if (a.indexOf("/") != -1) {
            g = a.indexOf("/");
        } else if (a.indexOf("*") != -1) {
            g = a.indexOf("*");
        } else {
            g = -1;
        }
        return g;
    }

    public double pd(String a) {
        return Double.parseDouble(a);
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }

    public static double subNumbers(double a, double b) {
        return a - b;
    }

    public static double multiplyNumbers(double a, double b) {
        return a * b;
    }

    public static double divNumbers(double a, double b) {
        return a / b;
    }

    public double compute(int a, double b, double c) {
        double answer = 0.0;
        if (a == 0) {
            answer = addNumbers(b, c);        // Run method for the application
        } else if (a == 1) {
            answer = subNumbers(b, c);
        } else if (a == 2) {
            answer = divNumbers(b, c);
        } else {
            answer = multiplyNumbers(b, c);
        }
        return answer;
    }

    public static void dispInfo() {
        String s = " Simple calculator program 		\n"
                + "*** Usage example *** 		\n"
                + "Addition: 		14.8+3.1	\n"
                + "Subtraction:		100-2		\n"
                + "Division: 		9/3			\n"
                + "Multiplication:		4*6		\n"
                + "Invalid input example:	6+, abcgt etc \n"
                + "Type done or exit to close the program		\n";

        System.out.println(s);
    }

    public static void ei() {
        System.out.println("Enter calculating combination:");
    }

}
