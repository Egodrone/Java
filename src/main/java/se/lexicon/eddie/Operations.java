/**
 * @name Simple Java Calculator
 * @author Eddie Chernyshov
 */
package se.lexicon.eddie;


public class Operations {

    public  boolean isNumber(String str) {
        try {
            double testStr = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
        }
        return false;
    }

    public double strToNumber(String str) {
        return Double.parseDouble(str);
    }

    public double strToDouble(String a) {
        return Double.parseDouble(a);
    }

    public double addNumbers(double a, double b) {
        return a + b;
    }

    public double subNumbers(double a, double b) {
        return a - b;
    }

    public double multiplyNumbers(double a, double b) {
        return a * b;
    }

    public double divNumbers(double a, double b) {
        return a / b;
    }


}
