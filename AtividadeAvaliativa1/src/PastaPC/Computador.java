package PastaPC;

import PastaHardware.HardwareBasico;
import PastaMemoriaUSB.MemoriaUSB;
import PastaOS.Sistemaoperacional;

public class Computador {
    private String marca;
    private float preco;
    private Sistemaoperacional sistemaoperacional; //composição==preciso de construtor
    private HardwareBasico [] hardwareBasico; //composição ==preciso de construtor
    private MemoriaUSB memoriaUSB; //agregação não preciso de construtor


    public Computador(Sistemaoperacional sistemaoperacional, HardwareBasico[] hardwareBasico) {
        this.sistemaoperacional = sistemaoperacional;
        this.hardwareBasico = hardwareBasico;
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

    public HardwareBasico[] getHardwareBasico() {
        return hardwareBasico;
    }

    public void setHardwareBasico(HardwareBasico[] hardwareBasico) {
        this.hardwareBasico = hardwareBasico;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }

    public void setMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }
}
