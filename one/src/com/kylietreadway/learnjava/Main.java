package com.kylietreadway.learnjava; //this is our package


//This is our main class. Everything in Java is an object, even our program!
public class Main {

    //this is a comment. This does not get compiled into the .class file


    //Main method. This is the entry point to the program. This is static because we can only have 1 of our program.
    //Think how we can't make a copy of our universe....
    public static void main(String args[]){
        //This method is public, because it can be accessed by things outside our object/class :)
        //this method is "void" because it does not return anything. The user starts the program and that is it.
        //main is just the name of the method, we always need a main as an entry point to the program. This method
        //is called automatically.

        //Hello world example :)
        System.out.println("Hello World!"); // We are using the System.out package. We are using the  println method,
                                            // we pass a String object

    }

}
