package com.examples.core;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int number = 1;

        while( number <= 100 ){ //loop will execute until the condition is false
            System.out.println(number);
            number = number + 1;
        }
    }
}
