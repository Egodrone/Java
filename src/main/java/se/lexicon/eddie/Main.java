/**
 * @name Simple Java Calculator
 * @author Eddie Chernyshov
 */
package se.lexicon.eddie;


import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        double number1, number2, answer;
        String str1, str2;
        str1 = str2 = "";
        boolean checkStr1 = false;
        boolean checkStr2 = false;
        number1 = number2 = answer = 0.0;
        boolean runProgram = true;
        String operationType = "";
        System.out.println("### Simple Calculator ###");
        System.out.println("### Type exit at any time to close the program ###");

        Operations additionalMethods = new Operations();

        while(runProgram) {
            System.out.printf("Enter the first number:");
            str1 = scObj.next();
            if(str1.equalsIgnoreCase("exit")) {
                break;
            }
            checkStr1 = additionalMethods.isNumber(str1);
            System.out.println("Enter an operation type:");
            operationType = scObj.next();
            if(operationType.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter the second number:");
            str2 = scObj.next();
            if(str2.equalsIgnoreCase("exit")) {
                break;
            }
            checkStr2 = additionalMethods.isNumber(str2);


            if(checkStr1 && checkStr2) {
                System.out.println("Given values are numbers");
                number1 = additionalMethods.strToNumber(str1);
                number2 = additionalMethods.strToNumber(str2);
                switch(operationType) {
                    case ("+"):
                        answer = additionalMethods.addNumbers(number1, number2);
                        break;
                    case ("-"):
                        answer = additionalMethods.subNumbers(number1, number2);
                        break;
                    case ("*"):
                        answer = additionalMethods.multiplyNumbers(number1, number2);
                        break;
                    case ("/"):
                        answer = additionalMethods.divNumbers(number1, number2);
                        break;
                    default:
                        System.out.println("Operation type is not valid");
                }
                System.out.println("Result is: " + answer);
            } else if(!checkStr1 || !checkStr2) {
                System.out.println("Invalid numbers are given");
            }


            //System.out.println("Result is: " + answer);
        }

        scObj.close();
        System.out.println("Program ended");
    }

}