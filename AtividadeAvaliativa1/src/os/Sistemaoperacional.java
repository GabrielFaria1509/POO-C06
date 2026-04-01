package os;

public class Sistemaoperacional {
    private String nome;
    private int tipo;

    public String getNome() {
        return nome;
    }

    public Sistemaoperacional(String nome, int tipo) {
        this.tipo = tipo;
        this.nome = nome;
    }
}
