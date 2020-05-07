package com.kylietreadway.learnjava; //this is our package


import com.kylietreadway.learnjava.dog.Dog;
import com.kylietreadway.learnjava.dog.GermanShepard;

import java.util.ArrayList;

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

        //let's use our dog objects!
        //but wait, we need to make some!

        //Let's declare one to exist (give it a space in memory)
        Dog cutie;
        //lets call the constructor to build our cute dog
        cutie = new Dog(5,true);

        //lets build another dog, but all at once!
        Dog ugly = new Dog(0, false);

        //Let's play with the dogs!

        cutie.shake_dry(); //this will cause a print out
        ugly.shake_dry(); //this doesn't do much

        //but what if I had 100 dogs? it would be a pain to call methods for all of them
        //I know they are all dogs, so I can treat them all the same....
        //Let's just store them in an iterable list

        ArrayList<Dog> myList = new ArrayList<Dog>(); //The <Dog> tells the compiler that this list will only contain Dogs

        myList.add(cutie);
        myList.add(ugly);

        //now to loop through the list an run a method for all the dogs :)
        for(Dog doggo: myList){
            doggo.bark(); //this will cause a printout.
            System.out.println("This dog has a tail length of: " + doggo.getTailLength());
        }

        int copy_tail; //declared a new int

        copy_tail = -1;
        System.out.println("The copy_tail prior to copy.... " + copy_tail);

        copy_tail = cutie.getTailLength(); //because getTailLength returns an int, this code is valid!
        System.out.println("The copy_tail after copy.... " + copy_tail);

        //logic....
        if(cutie.getTailLength() == ugly.getTailLength()){
            System.out.println("The dogs have the same tail length!");
        }
        else if(cutie.getTailLength() > ugly.getTailLength()){
            System.out.println("Cutie has the bigger tail!");
        }
        else if(cutie.getTailLength() < ugly.getTailLength()){
            System.out.println("Ugly has the bigger tail!");
        }

        if(cutie.hasFur() && ugly.hasFur()){
            System.out.println("They both have fur!");
        }
        else if(cutie.hasFur() || ugly.hasFur()){
            System.out.println("At least one of them has fur!");
        }
        else if(!cutie.hasFur() && !ugly.hasFur()){
            System.out.println("None of them have fur!");
        }

        //this is the same, but faster!
        if(cutie.hasFur() && ugly.hasFur()){
            System.out.println("They both have fur!");
        }
        else if(cutie.hasFur() || ugly.hasFur()){
            System.out.println("At least one of them has fur!");
        }
        else{
            System.out.println("None of them have fur!");
        }


        //lets show off our specialized doggo
        GermanShepard dave = new GermanShepard(10);
        //lets make a second, in another way!
        Dog davoo = new GermanShepard(10);
        //both the ways work fine! There is a difference I will explain later

        //why is this important...

        //well check this out, since a GermanShepard is a Dog, it can bark!

        dave.bark();
        //We didn't have to re-write this code. In minecraft, this is how all aggressive mobs can attack.
        //The powerful thing is that this method is guaranteed!
        myList.add(dave);
        myList.add(davoo);

        //what I mean by that, is we can go through all the dogs in a list and expect the same behavior
        for(Dog dogg: myList){
            dogg.bark();
        }
        //but if we know we are working with a GermanShepard, we can also call its unique features
        dave.bite(); //this is like how blazes in minecraft are special in that they can shoot fire balls.

        //but what about the difference of dave and davoo....
        //well we didn't ensure that davoo would be a GermanShepard, we just ensured he would be a dog.
        //this means that this code:
        //davoo.bite(); will cause compiler errors cause the compiler does not see the bite() method in Dog class

        //can we do something about this if we have some kind of "Expert knowledge"
        GermanShepard newDavoo = (GermanShepard) davoo;
        newDavoo.bite(); //yay, fixed! This works because we told the compiler that davoo was a German Shepard.
                        // this can be dangerous if we are wrong, only use it when you know you aren't wrong
                        // "what happens if we are wrong"
                        //you have problems...
                        //jk, it will just throw an error, if you don't handle the error the program crashes.
                        // more on that another time.
                        //Just know this is useful, cause sometimes we want to make new objects where we have to
                        //tell the compiler what the object is. Like reading from a file, we tell the compiler
                        //that the file will have Dog objects. If we are wrong, again error handling or crash.

    }

}
