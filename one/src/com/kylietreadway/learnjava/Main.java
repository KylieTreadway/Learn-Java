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
            System.out.println(a + " Size of int = 4 bytes, used to define numbers");

            boolean takes1Bit = true;
            if (takes1Bit) {
                System.out.println("Boolean takes 1 Bit of storage, this is used to make true or false statements");
            } else {
                System.out.println("I did something wrong");
                }

            char b = 'c';
            System.out.println(b);

            char CharArray[] = new char[14];
            CharArray[0] = 'C';
            CharArray[1] = 'h';
            CharArray[2] = 'a';
            CharArray[3] = 'r';
            CharArray[4] = ' ';
            CharArray[5] = '=';
            CharArray[6] = ' ';
            CharArray[7] = '2';
            CharArray[8] = ' ';
            CharArray[9] = 'B';
            CharArray[10] = 'y';
            CharArray[11] = 't';
            CharArray[12] = 'e';
            CharArray[13] = 's';
                 System.out.println(CharArray);


            }
        }
    }

