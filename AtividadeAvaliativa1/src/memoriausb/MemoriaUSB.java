package memoriausb;

public class MemoriaUSB {
    private String nome;
    private float capacidade;

    //Getters e Setters

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   //construtor

    public MemoriaUSB(float capacidade, String nome) {
        this.capacidade = capacidade;
        this.nome = nome;
    }
}
