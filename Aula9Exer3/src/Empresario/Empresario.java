package Empresario;

public class Empresario {
    private String nome;
    private long cnpj;

    //construtor

    public Empresario(long cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    //Getters
    public long getCnpj() {
        return cnpj;
    }
    public String getNome() {
        return nome;
    }
}
