package computador;
import hardware.HardwareBasico;
import memoriausb.MemoriaUSB;
import os.Sistemaoperacional;

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
    }

    public void setMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }

    public float getPreco() {
        return preco;
    }


    public void MostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco);
        System.out.println("Sistemaoperacional: " + this.sistemaoperacional.getNome());
        if(memoriaUSB != null){
            System.out.println("MemoriaUSB: " + this.memoriaUSB.getNome()+ " (" + this.memoriaUSB.getCapacidade() + " Gb)");
        }
        for (HardwareBasico basico : hardwareBasico) {
            //preciso ter certeza que tem algo alocado na memória
            if (basico != null)
                System.out.println("HardwareBasico: " + basico.getNome() + " Capacidade : " + basico.getCapacidade());
        }
    }
}
