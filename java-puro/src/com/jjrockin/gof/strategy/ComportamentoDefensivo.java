package com.jjrockin.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivelmente...");
    }
}
