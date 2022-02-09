package com.company.strategy;

public class ComportamentoDenfensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
