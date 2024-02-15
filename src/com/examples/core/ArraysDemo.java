package com.examples.core;

public class ArraysDemo {
    public static void main(String[] args) {
        int marks[] = new int[6];
        marks[0] = 98;
        marks[1] = 97;
        marks[2] = 96;
        marks[3] = 95;
        marks[4] = 99;
        marks[5] = 97;

        int marksTWO[] = {98, 99, 98, 94, 96, 95};

        int index = 0;
        int totalMarks = 0;
        while(index < marks.length){
            totalMarks = totalMarks + marks[index];
            index = index + 1;
        }

        System.out.println("TOTAL MARKS: "+totalMarks);

    }
}
