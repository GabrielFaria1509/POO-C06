package ClientePasta;

public class Cliente {
    private String nome;   //boa prática usar privado
    private long cpf;  //long é para inteiros maiores

    public String getNome() { //getter nome
        return nome;
    }
    public long getCpf() { //getter cpf
        return cpf;
    }

    public void setNome(String nome) { //setter nome
        this.nome = nome;
    }

    public void setCpf(long cpf) {  //setter cpf
        this.cpf = cpf;
    }
}
