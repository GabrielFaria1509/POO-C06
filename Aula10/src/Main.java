import boi.Boi;
import cachorro.Cachorro;
import lontra.Lontra;
import mamífero.Mamífero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        //Mamífero mamífero = new Cachorro("Doiso", 30) Possível
        //Classe abstrata mãr não deixa eu instanciar ela,é apenas uma referência
        Cachorro cachorro = new Cachorro("Doguinho",100);
        Boi boi = new Boi("Ben",300);
        Lontra lontra = new Lontra("Bob",50);

        cachorro.emitirSom();
        boi.emitirSom();
        lontra.emitirSom();

        lontra.MostrarInfo();
        boi.MostrarInfo();
        cachorro.MostrarInfo();

    }
}