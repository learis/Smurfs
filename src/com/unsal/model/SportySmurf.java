package com.unsal.model;

public class SportySmurf extends Smurfs implements Cooker {
    private boolean muscle;

    public SportySmurf(String skinColor, boolean small, boolean hat, int age, boolean muscle) {
        super(skinColor, small, hat, age);
        this.muscle = muscle;
    }

    public boolean isMuscle() {
        return muscle;
    }

    public void setMuscle(boolean muscle) {
        this.muscle = muscle;
    }

    public void workOut() {
        System.out.println("Spoty Smurf is working out!");
    }

    @Override
    public void eat() {
        System.out.println("Sporty Smurf is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Sporty Smurf is sleeping!");
    }

    @Override
    public void cook() {
        System.out.println("Sporty Smurf cooks!");
    }
}
