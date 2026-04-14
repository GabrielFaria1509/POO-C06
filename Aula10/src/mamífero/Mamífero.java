package mamífero;

public abstract class Mamífero {
    protected String nome;
    protected  double vida;

    //Abstract class garanto que é uma superclasse
    //Devo usar ela de referência

    //Construtor
    public Mamífero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }


    //Getters e Setters
    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void MostrarInfo(){
        System.out.println("Nome : " + nome);
        System.out.println("Vida : " + vida);
    }


    public abstract void emitirSom();
}
