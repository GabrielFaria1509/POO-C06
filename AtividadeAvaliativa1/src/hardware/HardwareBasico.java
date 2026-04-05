package hardware;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    //Getters e Setters

    public float getCapacidade() {
        return capacidade;
    }

    public String getNome() {
        return nome;
    }

    //construtor
    public HardwareBasico(String nome, float capacidade) {
        this.capacidade = capacidade;
        this.nome = nome;
    }




}
