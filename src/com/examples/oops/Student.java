package com.examples.oops;

public class Student {

    private int rollno;
    String name;
    double mathsMarks;

    public Student(int rollno, String name, double mathsMarks){
        this.rollno = rollno;
        this.name = name;
        this.mathsMarks = mathsMarks;
    }

    public void setRollno(int rollno){
        if(rollno > 0)
            this.rollno = rollno;
    }

    public int getRollno(){
        return rollno;
    }
}
