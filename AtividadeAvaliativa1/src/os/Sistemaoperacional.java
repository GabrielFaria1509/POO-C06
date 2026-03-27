package os;

public class Sistemaoperacional {
    private String nome;
    private int tipo;

    //Getters e Setters
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sistemaoperacional(String nome, int tipo) {
        this.tipo = tipo;
        this.nome = nome;
    }
}
