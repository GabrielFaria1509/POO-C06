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

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

   //construtor

    public MemoriaUSB(String nome, float capacidade) {
        this.capacidade = capacidade;
        this.nome = nome;
    }
}
