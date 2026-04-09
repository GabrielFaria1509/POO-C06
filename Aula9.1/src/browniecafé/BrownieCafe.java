package browniecafé;

import brownie.Brownie;

public class BrownieCafe extends Brownie {

    //Construtor
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor); //herda da superclasse
    }

    public void adicionaCafe(){
        System.out.println("Adicionando café");
    }

    @Override
    public void addCarrinho() {
        System.out.println("Adicionando brownie de café ao carrinho");
    }
}
