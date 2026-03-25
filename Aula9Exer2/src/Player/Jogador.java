package Player;

public class Jogador {
    private String nome;
    private int pontuacao;

    //Construtor

    public Jogador(int pontuacao, String nome) {
        this.pontuacao = pontuacao;
        this.nome = nome;
    }

    //Getter
    public String getNome() {
        return nome;
    }
    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter
    public int getPontuacao() {
        return pontuacao;
    }

    //Setter
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
