package classes;
import classes.Pessoa;

public class Filha2 extends Pessoa{
    private String nome;
    private Integer idade;

    public Filha2(String nome, Integer idade) {
        super(nome, idade);
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
