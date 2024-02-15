package com.examples.core;

public class ElseIfDemo {
    public static void main(String[] args) {
        boolean isEven = true;

        int number = 44;
        int reminder = number % 2;
        // Conditional Operators  == != < > <= >=
        if (reminder == 0)
            isEven = true;
        else
            isEven = false;

        System.out.println("EVEN NUMBER ? : "+isEven);
    }
}
