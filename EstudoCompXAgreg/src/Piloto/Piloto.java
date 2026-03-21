package Piloto;

import Carro.Carro;

public class Piloto {
    private String nome;
    //Piloto pode ou não ter um kart
    private Carro carro;
    //agregação->não precisa de construtor


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    //GETTERS
    public Carro getCarro() {
        return carro;
    }

    public String getNome() {
        return nome;
    }
}
