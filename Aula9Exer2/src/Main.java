import Blocos.Bloco;
import Blocos.Conversor;
import Player.Jogador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador(100,"Faria");
        Bloco bloco = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();



        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("Número de blocos : " + Bloco.getNumblocos());

        bloco2.DiminuirBloco();
        bloco3.DiminuirBloco();

        System.out.println("Número de blocos : " + Bloco.getNumblocos());

        System.out.println("Moedas obtidas : " + Conversor.moedasObtidas(jogador.getPontuacao()));
        System.out.println("Moedas obtidas : " + Conversor.moedasObtidas(100));

    }
}