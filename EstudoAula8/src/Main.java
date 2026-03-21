import ClientePasta.Cliente;
import ContaConjunta.Conta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //declarar instâncias
        Conta conta = new Conta();

        System.out.println("Digite seu limite da conta: ");
        conta.setLimite(input.nextDouble());

        System.out.println("Digite o número da conta: ");
        conta.setNumero(input.nextInt());

        input.nextLine(); //limpar o que ficou no buffer

        Cliente[] clientes =  new Cliente[3];  //declaro instância do vetor


       //retiro o null,deixo livre para colcoar algo
        for (int i = 0; i < 3; i++) {
            clientes[i] = new Cliente(); //retiro o null

            System.out.println("Digite nome do titular " + (i+1) + ": ");
            String titular = input.nextLine();

            clientes[i].setNome(titular);  //uso setter da classe cliente
        }

        //setto vetor de clientes na conta
        conta.setCliente(clientes);

        //usando métodos da conta
        conta.Depositar(10000000);
        conta.Sacar(1000);

        //usando getters
        for(Cliente C : clientes){  //for it
            System.out.println(C.getNome());
        }

        System.out.println("Saldo atual : " + conta.getSaldo());

        input.close();  //fecho entrada de dados
        }

    }

