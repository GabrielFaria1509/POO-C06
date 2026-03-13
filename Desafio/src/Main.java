import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int quantidade = 0;
        Bomba[][] matriz = new Bomba[6][6];
        Player player =  new Player();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = new Bomba();
                //guardo objeto no lugar null
            }
        }

        System.out.println("Iniciando preenchimento campo minado");

        Random rand = new Random();  //gero o criador de número aleatório

        for (int i = 0; i < 6; i++) {    //preencher e montando o campo minado
            for (int j = 0; j < 6; j++) {
                int aleatorio = rand.nextInt(31);  //até 30
                if (aleatorio >= 26) {
                    matriz[i][j].ativo = true;
                    matriz[i][j].levelbomba = 2;
                    matriz[i][j].dano = 5;
                    matriz[i][j].MostrarStatus();
                    quantidade++;

                } else if (aleatorio >= 20  && aleatorio < 26) {
                    matriz[i][j].ativo = true;
                    matriz[i][j].levelbomba = 1;
                    matriz[i][j].dano = 2;
                    matriz[i][j].MostrarStatus();
                    quantidade++;
                } else{
                      matriz[i][j].ativo = false;

                }
            }
        }

        System.out.println("Insira nome do Player : ");  //início jogo
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        player.nome = nome;

        player.vida = 20;


            while(player.vida > 0 && quantidade > 0) {
                System.out.println("Escolha uma posição(Linha/Coluna entre 0  e 5 ):");
                int linha = entrada.nextInt();
                int coluna = entrada.nextInt();

                if (matriz[linha][coluna].ativo == false) {
                    System.out.println("Não há bomba");
                } else {
                    matriz[linha][coluna].ativo = true;
                    System.out.println("Bomba encontrada !");
                    player.vida -= matriz[linha][coluna].dano;
                    matriz[linha][coluna].ativo = false; //desativar a bomba
                    quantidade = quantidade - 1;
                    player.mostrarInfo();
                }


            }

        if(player.vida > 0){
            System.out.println("Você ganhou ! ");
        }

        System.out.println("VIda zerada ! ");
    }
}







