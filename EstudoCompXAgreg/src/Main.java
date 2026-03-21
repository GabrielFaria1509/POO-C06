import Carro.Carro;
import Motor.Motor;
import Piloto.Piloto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Começo fazendo as instâncias
        Piloto piloto = new Piloto();
        Carro carro = new Carro();

        carro.setCor("prata");
        carro.setModelo("Ferrari");
        carro.setPreco(200000000);

        //Composição
        //Motor nasce junto com carro
        carro.getMotor().setPotencia(30);
        carro.getMotor().setLigado(true);

        piloto.setNome("Faria");

        //Agregação
        piloto.setCarro(carro);
        //piloto possui um carro


        piloto.getCarro().setApelido("Garanhão");
        // --- TESTANDO SE DEU TUDO CERTO ---
        System.out.println("\n--- Resumo ---");
        System.out.println("Piloto: " + piloto.getNome());
        System.out.println("Carro modelo: " + piloto.getCarro().getModelo());
        System.out.println("Potência do motor do carro do piloto: " + piloto.getCarro().getMotor().getPotencia());
        System.out.println("Preço: " + piloto.getCarro().getPreco());

    }
}