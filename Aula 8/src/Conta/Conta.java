package Conta;

import Cliente.Cliente;

public class Conta {
    private int numero;
    private double saldo;
    private double  limite;
    private Cliente[] clientes;  //declaro sem tamanho
    //boa prática ser td privado

     public Conta(){   //construtor
        this.clientes = new Cliente[10];  //composição preciso settar array
    }
    //não vou setar //são privados mais sentido usar getters


    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes; //settando array
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void Depositar(double quantia){
        if(saldo < limite){
            saldo += quantia;
        }else{
            System.out.println("Depósitos até : " + limite);
        }
    }
    public void Sacar(double quantia){
        if(saldo > 0){
            saldo -= quantia;
            System.out.println("Saldo : "  + saldo + " Quantia sacada : " + quantia);
        }else {
            System.out.println("Saldo insuficiente ! ");
        }
    }
}
