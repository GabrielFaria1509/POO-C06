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



    //Setters e Getters

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Computador[] getComputador() {
        return computador;
    } //composição

    public void setComputador(Computador[] computador) {
        this.computador = computador;
    }



    //metodo
    //retorna o preço total do pedido
    public float calulaTotoalCompra(){
        float soma = 0;
        for(Computador c : computador){
            if(c != null){
                soma += c.getPreco();

            }
        }

        return soma;
    }
}
