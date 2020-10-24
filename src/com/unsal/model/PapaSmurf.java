package com.unsal.model;

public class PapaSmurf extends Smurfs {
    private String dressColor;
    private boolean beard;

    public PapaSmurf(String skinColor, boolean small, boolean hat, int age, String dressColor, boolean beard) {
        super(skinColor, small, hat, age);
        this.dressColor = dressColor;
        this.beard = beard;
    }

    public String getDressColor() {
        return dressColor;
    }

    public void setDressColor(String dressColor) {
        this.dressColor = dressColor;
    }

    public boolean isBeard() {
        return beard;
    }

    public void setBeard(boolean beard) {
        this.beard = beard;
    }

    @Override
    public void eat() {
        System.out.println("Papa Smurf is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Papa Smurf is sleeping");
    }

    public void advise() {
        System.out.println("Papa Smurf is boringly advising!");
    }
}
