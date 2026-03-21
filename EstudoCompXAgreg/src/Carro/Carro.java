package Carro;

import Motor.Motor;

public class Carro {
    private String modelo;
    private String cor;
    private double preco;
    private String apelido;

    //Carro precisa do motor==Composição
    //preciso de um construtor para o motor

    private Motor motor;

    public Carro(){
        motor = new Motor();  //construtor
    }


    //SETTER E GETTER DO MODELO
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //SETTER E GETTER DO MODELO DA COR
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //SETTER E GETTER DO PREÇO
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //SETTER E GETTER DO APELIDO
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    //GETTER MOTOR
    //Agora carro pode usar as coisas de motor
    public Motor getMotor() {
        return motor;
    }
}
