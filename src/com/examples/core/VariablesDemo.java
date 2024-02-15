package com.examples.core;

public class VariablesDemo {
    public static void main(String[] args) {
        // datatypes - int, short, long, double, char, boolean, String
        //Variable declaration - <data_type> <variable_name>;
        int firstNumber = 24 , secondNumber = 7;
        double result;
        /*
            Assignment Statements
            firstNumber = 24; // RHS - it can be a value or expression
            secondNumber = 7;
        */

        result = firstNumber + secondNumber;

        System.out.println("RESULT: "+result);

        result = firstNumber * secondNumber;

        System.out.println("MULTIPLY RESULT: "+result);

        result = firstNumber - secondNumber;

        System.out.println("SUBTRACT RESULT: "+result);

        result = (double)firstNumber / secondNumber;//Type Casting

        System.out.println("DIVISION RESULT: "+result);

        result = firstNumber % secondNumber;

        System.out.println("REMINDER RESULT: "+result);


    }
}
