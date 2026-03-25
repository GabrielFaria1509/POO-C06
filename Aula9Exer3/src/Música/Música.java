package Música;

public class Música {
    private  String nome;
    private double duracao;

    //construtor

    public Música(double duracao, String nome) {
        this.duracao = duracao;
        this.nome = nome;
    }

    //Setters e Getters

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
