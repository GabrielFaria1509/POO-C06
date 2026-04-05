package memoriausb;

public class MemoriaUSB {
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

    public MemoriaUSB(String nome, float capacidade) {
        this.capacidade = capacidade;
        this.nome = nome;
    }
}
