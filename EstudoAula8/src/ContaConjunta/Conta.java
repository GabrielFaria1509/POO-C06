package ContaConjunta;

import ClientePasta.Cliente;

public class Conta {
         //private somente classe dona pode acessar  //uso de setters e getters
    private double saldo;
    private double limite;
    private int numero;
    private Cliente[] clientes = new Cliente[3];  //como no construtor já falo tamanho apagar new CLiente[3] tb funciona
    //declaro uma referência
    //é composição logo conta não existe sem ter cliente

    //conta faz composição com cliente

    //construtor
    public Conta(){
        clientes = new Cliente[3];  //construo o vetor que depois vou preencher
    }
    //setters exemplo
    //saldo não precisa setter,pessoa só vai ver de depositar,não definir o quanto ela quer ter
    public void setLimite(double limite) {
        this.limite = limite;
    }
    //setter não retorna então é void

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente[] clientes){
        this.clientes = clientes;
    }
    //como diagrama pede esse //metodo nao precisaria do setter
    //vou deixar para estudar

    //exemplo getters
    //getter apenas pegam o valor , devem ser do tipo do valor
    //quem decide se vai pucar ou não é a main

    public double getSaldo(){
        return saldo;
    }

    public double  getLimite(){
        return limite;
    }

    public Cliente[]getClientes(){    //apenas devolvo o veortr inteiro
        return clientes;
    }


    public void Sacar(double quantia) {  //metodo
        // Verifica se é positivo e se o valor solicitado não ultrapassa o saldo + limite
        if (quantia > 0 && quantia <= (saldo + limite)) {
            saldo -= quantia;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou quantia inválida.");
        }
    }

    public void Depositar(double quantia){
        if(quantia > 0){
            saldo+=quantia;
        }else{
            System.out.println("Apenas valores positivos");
        }
    }





}
