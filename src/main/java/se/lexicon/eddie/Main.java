/**
 * @name Simple Java Calculator
 * @author Eddie Chernyshov
 */
package se.lexicon.eddie;


import java.util.Scanner;


public class Main {
    protected static String mathArr[] = {"+", "-", "/", "*"};    // math operations array

    public static void main(String[] args) {
        double na, nb, answer;
        na = nb = answer = 0.0;
        String values, fn, sn;
        values = fn = sn = "";
        int sv, vl, i;
        long cop;
        cop = 0;

        Operations c2 = new Operations();    // INSTANTIATE an object
        c2.dispInfo();    // Display application usage information
        c2.ei();

        Scanner scObj = new Scanner(System.in); // Create a Scanner object

        while (!values.equals("done") && !values.equals("exit")) {
            values = scObj.nextLine();  // Read user input
            sv = c2.evStr(values);    // Find the place of the operator
            vl = values.length();    // Length of the user input string

            // check so there is values before and after operator
            if (sv != -1 && (vl - 1) != sv) {
                fn = values.substring(0, sv);        // Number before operator
                sn = values.substring(sv + 1, vl);    // Number after the operator

                // iterate over declared math operations
                for (i = 0; i < mathArr.length; i++) {
                    // accessing each element of the array and checking if math operation is in the user input
                    sv = values.indexOf(mathArr[i]);
                    if (sv != -1) {
                        na = c2.pd(fn);    // passing the string and parsing to double
                        nb = c2.pd(sn);
                        answer = c2.compute(i, na, nb); // Run method for the application
                        System.out.println(values + " = " + answer);
                    }
                }

                c2.ei();
            } else {
                if (!values.equals("done") && !values.equals("exit")) {
                    System.out.printf(values + " is invalid combination, Try again:");
                }
            }

        }

        scObj.close();
        System.out.println("Program ended");
    }

}
