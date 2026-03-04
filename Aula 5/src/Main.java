import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Piloto piloto = new Piloto();
        Kart kart = new Kart();
        kart.piloto = piloto; //agregação

        System.out.println("Qual o nome do piloto ?");
        String nome;
        nome = input.nextLine();
        piloto.nome = nome;

        System.out.println("Qual o nome do kart ?");
        String nomekart;
        nomekart = input.nextLine();
        kart.nome = nomekart;

        System.out.println("É uma vilão ou vilão ?");
        System.out.println("1-Sim 2-Não");
        int resposta;
        resposta = input.nextInt();
        if(resposta==1){
            piloto.vilao = true;
        }else{
            piloto.vilao = false;
        }
        System.out.println("Quantas cilindradas ?");
        System.out.println("1-150 2-100 3-50");
        int resposta2 =input.nextInt();
        switch (resposta2){
            case 1:
                kart.motor.cilindradas = "150";
                break;
            case 2:
                kart.motor.cilindradas = "100";
                break;
            case 3:
                kart.motor.cilindradas = "50";
                break;

        }

        System.out.println("Qual a velocidade máxima ² ");
        float vel = input.nextFloat();
        kart.motor.velocidadeMaxima = vel;

        kart.fazerDrift();
        kart.pular();
        kart.soltarTurbo();

        kart.motor.mostrarInfo();

        piloto.soltaSuperPoder();

        input.close();


















    }
}