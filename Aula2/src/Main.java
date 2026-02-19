import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira NP1:");
        double NP1 = entrada.nextDouble();

        System.out.println("Insira NP2:");
        double NP2 = entrada.nextDouble();

        double media1 = (NP1 + NP2 )/2;

        if(media1 >=60){
            System.out.println("Aprovado");
        }else{
            System.out.println("Faça a recuperação e insira a nota : ");
            System.out.println("Insira a NP3:");
            double NP3 = entrada.nextDouble();

            double media2 = (NP3 + media1)/2;
            if(media2 >=50){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }

        entrada.close();

    }

}
