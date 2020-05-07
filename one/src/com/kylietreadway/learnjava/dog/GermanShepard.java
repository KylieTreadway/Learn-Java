package com.kylietreadway.learnjava.dog;

public class GermanShepard extends Dog{

    public GermanShepard(int tailLength) {
        super(tailLength, true);
    }

    public void bite(){
        System.out.println("CHOMP!");
    }
}
