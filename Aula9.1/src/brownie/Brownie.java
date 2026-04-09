package brownie;

public class Brownie {
    protected  String nome;
    protected double preco;
    protected  String sabor;


    //Construtor
    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    //Metodos

    public void addCarrinho(){
        System.out.println("Adicionando ao carrinho");
    }

    //Getter //Setter
    public String getNome() {
        return nome;
    }

    public String getSabor() {
        return sabor;
    }

    public void calculaValorTotalCompra(double preco){
        System.out.println("Preço total : " + this.preco );
        System.out.println("Nome : " + this.nome);
    }

    public double getPreco() {
        return preco;
    }

    public void mostraInfo(){
        System.out.println("Sabor brownie : " + this.sabor);
        System.out.println("Preço : " + this.preco);
        System.out.println("Nome : " + this.nome);
    }


}
