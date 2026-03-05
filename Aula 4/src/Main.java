
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Faria";
        zumbi2.nome = "Farinha";

        zumbi1.andar();
        zumbi2.andar();



        System.out.println("Qual o nome do zumbi escolhido? ");
        String entrada = input.nextLine();

        if(entrada.equals("Faria")){
            System.out.println("Quanto de vida ele vai ter ? ");
            double vida = input.nextDouble();
            input.nextLine(); //limpar buffer
            zumbi1.vida=vida;

            zumbi1.mostrarVida();
            zumbi2.vida=300;
        }else{
            System.out.println("Quanto de vida ele vai ter ? ");
            double vida = input.nextDouble();
            input.nextLine(); //limpar buffer
            zumbi2.vida=vida;
            zumbi1.vida = 300;

        }

        System.out.println("Qual o zumbi vai transferir hp ? ");
        String alvo = input.nextLine();


        if(alvo.equals("Faria")){
            System.out.println("Quanto de vida ele vai transferir hp ? ");
            double hpdoado = input.nextDouble();
            zumbi1.transfereVida(zumbi2,hpdoado);
            zumbi1.mostrarVida();

        }else{
            System.out.println("Quanto de vida ele vai transferir hp ? ");
            double hpdoado = input.nextDouble();
            zumbi2.transfereVida(zumbi1,hpdoado);
        }

        zumbi1.mostrarVida();
        zumbi1.info();

        zumbi2.mostrarVida();
        zumbi2.info();




    }
}
