package com.unsal.model;

public abstract class Smurfs implements AbilityOfSmurfs {
    private String skinColor;
    private boolean small;
    private boolean hat;
    private int age;

    public Smurfs() {
        skinColor = "blue";
        small = true;
        hat = true;
        age =1;
    }

    public Smurfs(String skinColor, boolean small, boolean hat, int age) {
        this.skinColor = skinColor;
        this.small = small;
        this.hat = hat;
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public boolean isSmall() {
        return small;
    }

    public void setSmall(boolean small) {
        this.small = small;
    }

    public boolean isHat() {
        return hat;
    }

    public void setHat(boolean hat) {
        this.hat = hat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void jump() {
        System.out.println("Smurfs are jumping!");
    }


}
