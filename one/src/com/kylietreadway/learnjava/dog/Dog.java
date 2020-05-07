package com.kylietreadway.learnjava.dog;

public class Dog {

    //We don't want other parts of a program to directly mutate variable. Hard to find bugs this way
    private int tailLength;
    private boolean hasFur;

    //this is a constructor, it is the method with a capital in the beginning and no return type (not even void!)
    //always public cause it is called by other parts of the program
    public Dog(int tailLength, boolean hasFur){
        this.tailLength = tailLength;
        this.hasFur = hasFur;
    }
    public void bark(){
        System.out.println("Woof");
    }
    public void shake_dry(){
        if(hasFur){
            System.out.println("Move away, it's about to rain!");
        }
    }

    //has a return type of int! this return numbers when called!
    public int getTailLength() {
        return tailLength;
    }



    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

}
