import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bomba[][] matriz = new Bomba[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = new Bomba();  //aqui eu preenchi
                //guardo objeto no lugar null
        }
    }

        for (int i = 0; i < 6; i++) {    //preencher
            for (int j = 0; j < 6; j++) {
                Random rand = new Random();
                int aleatorio = rand.nextInt(21);  //até 20
                if (aleatorio > 10) {
                    matriz[i][j].ativo = true;
                    matriz[i][j].levelbomba = 2;

                } else if (aleatorio > 7 && aleatorio < 10) {
                    matriz[i][j].ativo = true;
                    matriz[i][j].levelbomba = 1;
                } else if (aleatorio < 7) {
                    matriz[i][j].ativo = false;

                }
            }
        }
    }
}


