package com.unsal.data;

import com.unsal.model.PapaSmurf;
import com.unsal.model.Smurfette;
import com.unsal.model.Smurfs;

public class Main {
    public static void main(String[] args) {
        Smurfs smurfs1 = new PapaSmurf("blue", true, true, 71, "red", true);
        smurfs1.eat();
        smurfs1.sleep();
        smurfs1.jump();

        System.out.println("--------------------");

        Smurfette smurfette = new Smurfette("Blue", true, true, 28, true, true);
        smurfette.cook();
        smurfette.eat();
        smurfette.sleep();
    }
}
