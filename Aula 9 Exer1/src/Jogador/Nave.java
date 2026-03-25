package Jogador;

import Inimigo.Asteroide;

public class Nave {

    //atributos
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    //setters ==posso alterar depois
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    //getters == apenas puxo tais valores
    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    //Construtor
    public Nave(double vida, String nome, String tipoTiro) {
        this.vida = vida;
        this.nome = nome;
        this.tipoTiro = tipoTiro;
    }

    public void Atirar(Asteroide asteroide){
        System.out.println("Nave está atirando no asteroide ! ");
    }


}
