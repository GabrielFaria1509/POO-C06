package brownienutella;

import brownie.Brownie;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando nutella");
    }

    @Override
    public void addCarrinho() {
        System.out.println("Adicionando brownie de nutella ao carrinho");

    }
}
