package Interfaces.Impl;

import Interfaces.Ink;
import Interfaces.Pen;

public class Bitco implements Pen {
    private Ink ink ;

    public Bitco(Ink ink) {
        this.ink = ink;
    }

    @Override
    public void write() {
        System.out.println("You are using "+ ink.getColor() + "of "+getClass().getName() +"company");
    }
}
