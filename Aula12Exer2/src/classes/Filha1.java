package classes;
import classes.Pessoa;

public class Filha1 extends Pessoa {
    private String nome;
    private Integer idade;


    public Filha1(String nome, Integer idade) {
        super(nome, idade);
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

}
