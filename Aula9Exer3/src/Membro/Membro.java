package Membro;

public class Membro {
    //vetor de membros
    private Membro[]membros; //declaro vetor sem tamanho
    private String nome;
    private String funcao;

    //construtor

    public Membro(String funcao, String nome) {
        this.funcao = funcao;
        this.nome = nome;
    }

    //Setters e getters
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
