package com.examples.oops;

public class Test {
    public static void main(String[] args) {
        Calculator calcObj = new Calculator();

        double result = calcObj.multiply();

        System.out.println("RESULT: "+result);

        Calculator secondCalcObj = new Calculator(56, 9);

        result = secondCalcObj.multiply();

        System.out.println("RESULT: "+result);

        AdvancedCalculator advCalcObj = new AdvancedCalculator(45, 8, 90);

        result = advCalcObj.add();
        System.out.println("ADDTION RESULT: "+result);
        result = advCalcObj.sinValue();
        System.out.println(" SIN VALUE: "+result);
    }
}


// Inheritence - inherits the properties of a class
// Data Abstraction - hiding the implementation details
// Data Encapsulation - enclosing all related items into one single entity
// Polymorphism