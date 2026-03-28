package computador;
import hardware.HardwareBasico;
import memoriausb.MemoriaUSB;
import os.Sistemaoperacional;

import java.util.Arrays;

public class Computador {
    private String marca;
    private float preco;
    private Sistemaoperacional sistemaoperacional; //composição==preciso de construtor
    private HardwareBasico[] hardwareBasico; //composição ==preciso de construtor
    private MemoriaUSB memoriaUSB; //agregação não preciso de construtor



    //Composição com os dois,preciso de um construtor
    public Computador(Sistemaoperacional sistemaoperacional,HardwareBasico[] hardwareBasico) {
        this.sistemaoperacional = sistemaoperacional;
        this.hardwareBasico = new HardwareBasico[10]; //declaroi tamanho

        for(int i = 0; i < hardwareBasico.length; i++){
            if(hardwareBasico[i] != null){
               this.hardwareBasico[i] = hardwareBasico[i];
            }
        }
    }

    //Setters e Getters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    };
    public Sistemaoperacional getSistemaoperacional() {
        return sistemaoperacional;
    }
    public void setSistemaoperacional(Sistemaoperacional sistemaoperacional) {
        //setter é para caso altere esse atributo
        this.sistemaoperacional = sistemaoperacional;
    }
    public void setHardwareBasico(HardwareBasico[] hardwareBasico) {
        this.hardwareBasico = hardwareBasico;
    }
    public HardwareBasico getHardwareBasico(int posicao) {
        return this.hardwareBasico[posicao];
    }
    public void setMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }
    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }
    public String getMarca() {
        return marca;
    }
    public float getPreco() {
        return preco;
    }
    public HardwareBasico[] getHardwareBasico() {
        return hardwareBasico;
    }

    public void MostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco);
        System.out.println("Sistemaoperacional: " + this.sistemaoperacional.getNome());
        if(memoriaUSB != null){
            System.out.println("MemoriaUSB: " + this.memoriaUSB.getNome()+ " (" + this.memoriaUSB.getCapacidade() + " Gb)");
        }
        for(int i = 0; i < hardwareBasico.length; i++){
            if(hardwareBasico[i] != null){ //preciso ter certeza que tem algo alocado na memória
                System.out.println("HardwareBasico: " + this.hardwareBasico[i].getNome() + " Capacidade : " + this.hardwareBasico[i].getCapacidade());
            }
        }
    }
}
