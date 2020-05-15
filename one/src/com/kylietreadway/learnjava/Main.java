package com.kylietreadway.learnjava;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World");


        Zodiac scorpio;

        scorpio = new Zodiac(10, false);

        Zodiac pisces = new Zodiac(8, true);

        scorpio.introduction();
        pisces.introduction();

        ArrayList<Zodiac> myList = new ArrayList<Zodiac>();

        myList.add(scorpio);
        myList.add(pisces);

        for (Zodiac zodiacs : myList) {
            zodiacs.greet();
            System.out.println("This zodiacs rudeness level is:" + zodiacs.getRudenessLevel());

        // Using this for separation purposes only!! //

            int a;
            a = 1;
            System.out.println(a);
            System.out.println("a size = 4 bytes");
        }
    }
}
