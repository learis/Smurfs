package com.unsal.model;

public class Smurfette extends Smurfs implements Cooker {
    private boolean skirt;
    private boolean longHair;

    public Smurfette(String skinColor, boolean small, boolean hat, int age, boolean skirt, boolean longHair) {
        super(skinColor, small, hat, age);
        this.skirt = skirt;
        this.longHair = longHair;
    }

    public boolean isSkirt() {
        return skirt;
    }

    public void setSkirt(boolean skirt) {
        this.skirt = skirt;
    }

    public boolean isLongHair() {
        return longHair;
    }

    public void setLongHair(boolean longHair) {
        this.longHair = longHair;
    }

    public void makeUp() {
        System.out.println("Smurfette is making herself up!");
    }

    @Override
    public void eat() {
        System.out.println("Smurfette is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Smurfette is sleeping!");
    }


    @Override
    public void cook() {
        System.out.println("Smurfette cooks!");
    }
}
