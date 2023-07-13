package org.example;

import java.util.Arrays;

public class Scratch {

    // main method, used to run programs
    // Can I run a program in Java without a main? Let's try...
    // nope... the main method is the entry point to the program for the JVM.
    // Without the main method, the JVM doesn't know what to do with the program

    /*
    * To begin a multiline comment, press Ctrl+Shift+/
    * */

    // a single line comment is denoted by //
//    keyboard shortcut for a single line comment is Ctrl+/


    /*
    * The components of the main method are
    *   public -> access specifier. Must be public. If we used private, protected, or default, the JVM wouldn't be able to find the main
    *   static -> makes the method static. static methods belong to a class, not the instance of a class, meaning we can call static methods without creating an object.
    *   void   -> return type. void means nothing is returned.
    *   main() -> method signature (name). Default defined in the JVM. main is called by the JVM and executed line by line.
    *   String[] args -> String array of input arguments
    * */
    public static void main(String[] args) {
        System.out.println("hello");

        // As the main is the entry point for the JVM into the program, the main only needs to contain what the program
        // needs to run. This includes other method calls.
        trial();
    }

    public static void trial() {
        System.out.println("world");
    }

}
