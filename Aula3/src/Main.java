import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        int numAlunos = entrada.nextInt();

        switch (numAlunos){
            case 10:
            case 20:
                System.out.println("SalaI-16");
                break;
            case 30:
                System.out.println("Sala-I17");
                break;

        }
    }
            */
        Random rand = new Random(); //Gera número aleatório

        int numGerado,chute;
        numGerado = rand.nextInt(10)+1;

        System.out.println("Digite um número entre 1 e 10 : ");
        chute = entrada.nextInt();

        while(numGerado != chute){
            System.out.println("Número errado ! Tente novamente");
            if(numGerado > chute){
                System.out.println("O número misterioso é maior");
            }else{
                System.out.println("O número misterioso é menor");
            }
            chute = entrada.nextInt();

        }

        System.out.println("Acertou ! ");



    }
}