package PastaCliente;

public class Cliente {
    private String nome;
    private String cpf;

    //Construtor
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    //Setters e Getters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
