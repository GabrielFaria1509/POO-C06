package hardware;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    //Getters e Setters

    public float getCapacidade() {
        return capacidade;
    }

    //construtor


    public HardwareBasico(float capacidade, String nome) {
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
