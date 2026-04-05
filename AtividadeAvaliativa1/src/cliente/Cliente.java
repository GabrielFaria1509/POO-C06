package cliente;

import computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computador = new Computador[3];  //incializa vetor de computadore
    //cliente pode ter vários computadores

    //Construtor
    public Cliente(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }


    //uso para quando quero manipular o veotr cok os com compitadores já prontos
    //o veotr é uma sacola de compra do cliente
    public void setComputador(Computador[] computador) {
        this.computador = computador;
    }

    public float calculatotalCompra(){
        float soma = 0;
        for (Computador value : computador) {
            if (value != null) {
                soma += value.getPreco();
            }
        }

        return soma;
    }
}
