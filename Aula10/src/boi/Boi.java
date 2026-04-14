package boi;

import mamífero.Mamífero;

public class Boi extends Mamífero {
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de boi(imagina o som ae)");
    }
}
