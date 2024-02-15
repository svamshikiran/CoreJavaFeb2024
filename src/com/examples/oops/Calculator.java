package com.examples.oops;

public class Calculator {
    //Instance Variables or Class Variables or Properties
    double firstNumber;
    double secondNumber;

    // Contructor Overloading
    Calculator(){
        firstNumber = 23;
        secondNumber = 14;
    }

    Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    //Behaviours or Methods

    //Method Overloading
    //Same method name with different behaviour
    //Same class
    //method signature is different
    public double add(){
        return firstNumber + secondNumber;
    }

    public double add(double thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }
    public double subtract(){
        return firstNumber - secondNumber;
    }
    public double multiply(){
        return firstNumber * secondNumber;
    }
    public double divide(){
        return firstNumber / secondNumber;
    }

}
