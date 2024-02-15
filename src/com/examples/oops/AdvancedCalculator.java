package com.examples.oops;

public class AdvancedCalculator extends Calculator{

    AdvancedCalculator(double firstNumber, double secondNumber, double angle){
        super(firstNumber, secondNumber);
        this.angle = angle;
    }

    double angle;

    public double sinValue(){
        return Math.sin(angle);
    }

    //Same method signature
    //occurs in base class and sub class
    public double divide(){
        if (firstNumber == 0 || secondNumber == 0) {
            System.out.println("ONE OF THE INPUT IS ZERO - NO DIVISION OP PERFORMED");
            return 0;
        }
        return firstNumber / secondNumber;
    }

}
