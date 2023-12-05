package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
<<<<<<< c76b9a576c7c0785e4a594978d5b074cc896180b
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
            return operand1 - operand2;

    }

    public static double multiply(double operand1, double operand2) {
            return operand1 * operand2;

    }

    public static Boolean areEqual(double operand1, double operand2) {
            return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
            return operand1 < operand2;

    }

    public static Boolean isMoreThan(double operand1, double operand2) {
            return operand1 > operand2;

=======
        double result= operand1+operand2;
        return result;        
        
    }

    public static double subtract(double operand1, double operand2) {
        double result = operand1-operand2;
        return result;
    }

    public static double multiply(double operand1, double operand2) {
        double result = operand1*operand2;
        return result;
        
    }

    public static Boolean areEqual(double operand1, double operand2) {
        boolean result = operand1==operand2;
        return result;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        boolean result = operand1 < operand2;
        return result;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        boolean result =  operand1 > operand2;
        return result;
>>>>>>> saving changes that were made before main was up to date
    }
}
