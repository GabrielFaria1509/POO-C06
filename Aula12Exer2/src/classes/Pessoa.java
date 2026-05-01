package classes;

public abstract class Pessoa implements Comparable<Pessoa>{
   private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getter

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
   //Modo par comprar em crescente
    //Crescente  inverter símbolos do 1
    public int compareTo(Pessoa o) {
        if(this.idade < o.getIdade()){
            return 1;
        }
        if(this.idade > o.getIdade()){
            return -1;
        }

        return 0;
    }

}
