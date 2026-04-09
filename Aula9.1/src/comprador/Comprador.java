package comprador;

import brownie.Brownie;

public class Comprador {
    private String nome;
    private double saldo;

    //Construtor
    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    //Como comprador recebe a superclasse ele consegue acessa as subclasses
    public void Compra(Brownie brownie){

        System.out.println("Sabor do browie : " + brownie.getNome());

        System.out.println("Compra total");
        brownie.calculaValorTotalCompra(brownie.getPreco());
    }
}
