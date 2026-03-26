package PastaPC;

import PastaMemoriaUSB.MemoriaUSB;
import PastaOS.Sistemaoperacional;

public class Computador {
    private String marca;
    private float preco;
    private Sistemaoperacional sistemaoperacional; //composição==preciso de construtor
    private MemoriaUSB memoriaUSB; //agregação não preciso de construtor

    public Computador(Sistemaoperacional sistemaoperacional) {
        this.sistemaoperacional = sistemaoperacional;
    }

    //Setters e Getters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Sistemaoperacional getSistemaoperacional() {
        return sistemaoperacional;
    }

    public void setSistemaoperacional(Sistemaoperacional sistemaoperacional) {
        this.sistemaoperacional = sistemaoperacional;
    }
}
