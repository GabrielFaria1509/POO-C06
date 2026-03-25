import Inimigo.Asteroide;
import Jogador.Nave;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Insira nome do jogador : ");
        nome = input.nextLine();
        double vida = 50;
        String tipoTiro = "Forte";

        Nave nave = new Nave(nome,vida,tipoTiro);

        System.out.println("Piloto/Jogador : " + nave.getNome());
        System.out.println("Tipo de tiro : " + nave.getTipoTiro());

        Asteroide asteroide = new Asteroide("Asteroide brabo","Muito grande");
        nave.Atirar(asteroide);
        asteroide.destruir();
        input.close();

    }
}