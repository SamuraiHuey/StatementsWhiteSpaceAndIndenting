package com.samuraihuey;

public class Main {
    public static void main(String[] args) {
        // Statement is the entire line ending with ;
        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        // A multi line statement is possible as long as the terminator is at the end of the statement
        System.out.println("This is" +
                " another" +
                " still more");

        // you can also put them on the same line if broken up by terminator
        int anotherVariable = 50;
        myVariable--;
        System.out.println("another one");

        //Indenting is good for clarity in scope of different code blocks

    }
}