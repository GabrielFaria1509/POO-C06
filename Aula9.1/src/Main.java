import brownie.Brownie;
import browniecafé.BrownieCafe;
import browniedocedeleite.BrownieDoceDeLeite;
import brownienutella.BrownieNutella;
import comprador.Comprador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BrownieNutella brownienut = new BrownieNutella("BrownieNutella",16.50F,"Nutella");
       BrownieCafe browniecafe = new BrownieCafe("BrownieCafe",15.50F,"Café");
       BrownieDoceDeLeite browniedll = new BrownieDoceDeLeite("BrownieDoceDeLeite",12.50F,"Doce de leite");

       browniecafe.addCarrinho();
       browniedll.addCarrinho();
       brownienut.addCarrinho();

       browniedll.mostraInfo();
       browniedll.adicionaDoceDeLeite();

       brownienut.mostraInfo();
       brownienut.adicionaNutella();;

       browniecafe.mostraInfo();
       browniecafe.adicionaCafe();

       browniedll.calculaValorTotalCompra(browniedll.getPreco());
       browniecafe.calculaValorTotalCompra(browniecafe.getPreco());
       brownienut.calculaValorTotalCompra(brownienut.getPreco());

       Comprador cliente = new Comprador("Faria",35.60F);
      cliente.Compra(browniecafe);
      cliente.Compra(browniedll);
      cliente.Compra(brownienut);















    }
}