package com.kylietreadway.learnjava;

public class Zodiac {

    private int rudenessLevel;
    private boolean hasEmpathy;

    public Zodiac(int rudenessLevel, boolean hasEmpathy) {
        this.rudenessLevel = rudenessLevel;
        this.hasEmpathy = hasEmpathy;
    }

    public void greet() {
        System.out.println("Hello");
    }

    public void introduction() {
        if (hasEmpathy) {
            System.out.println("How are you?");
        }

    }

    public int getRudenessLevel() {
        return rudenessLevel;
    }
     public boolean hasEmpathy() {
         return hasEmpathy;
    }
     public void setHasEmpathy(boolean hasEmpathy) {
         this.hasEmpathy = hasEmpathy;
    }
    }