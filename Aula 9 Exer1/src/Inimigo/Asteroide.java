package Inimigo;

public class Asteroide {

    //atributos
    private String nome;
    private String tipoAsteroide;

    //setters == posso manipular
    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getters ==apenas puxo valor

    public String getNome() {
        return nome;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public Asteroide(String tipoAsteroide, String nome) {
        this.tipoAsteroide = tipoAsteroide;
        this.nome = nome;
    }

    public void destruir(){
        System.out.println("Asteroide destruido do tipo : " + tipoAsteroide);
        System.out.println("Nome do asteroide : " + nome);
    }
}
