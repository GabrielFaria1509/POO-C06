public class Cliente {
    private String nome;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void mostarInfoCliente(){
        System.out.println("Nome : " + nome);
    }
}
