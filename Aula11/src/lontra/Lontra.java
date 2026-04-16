package lontra;
import aquatico.Aquatico;
import mamífero.Mamífero;

public class Lontra extends Mamífero implements Aquatico {

    //Construtor
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    //Metodo abstrato
    //Classe que herda precisa ter,não é opcional
    @Override
    public void emitirSom() {
        System.out.println("Som de lontra(imagina e tmj)");
    }

    @Override
    public void nadar(){
        System.out.println("Lontra está nadando('u')");
    }
}
