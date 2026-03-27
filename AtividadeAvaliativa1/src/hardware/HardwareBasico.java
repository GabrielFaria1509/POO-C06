package hardware;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    //Getters e Setters

    public float getCapacidade() {
        return capacidade;
    }

    //construtor


    public HardwareBasico(String nome, float capacidade) {
        this.capacidade = capacidade;
        this.nome = nome;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
