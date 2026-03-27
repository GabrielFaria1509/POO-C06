//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in tim=
//import dos pacotes


import cliente.Cliente;
import hardware.HardwareBasico;
import memoriausb.MemoriaUSB;
import os.Sistemaoperacional;
import computador.Computador;
import processamentopedidos.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciando classes
        Cliente cliente = new Cliente("Gabriel","132543433"); //crio o cliente
        Computador[] computador =  new Computador[10]; //crio o vetor para receber os computadores\\
        //cliente compra mais de um pc ent pc é um vetor
        //computador tem um vetor com vários pc,cada pc tem um vetor de hardware

        //crio agora cada as opções dos produtos

        //Promo1
        // Hardwares da Promoção 1
        HardwareBasico[] hwsPromo1 = {
                new HardwareBasico("Pentium Core i3", 2200),
                new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500)
        };
        //Promo2
        HardwareBasico[] hwsPromo2 = {
                new HardwareBasico("Pentium Core i5", 3370),
                new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1000)
        };

        //Promo3
        HardwareBasico[] hwsPromo3 = {
                new HardwareBasico("Pentium Core i7", 4500),
                new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2000)
        };

        //Sistema operacional não é vetor em si
        Sistemaoperacional sistemaoperacional1promo1 = new Sistemaoperacional("MacOS Sequoia", 64);
        Sistemaoperacional sistemaoperacional2promo2 = new Sistemaoperacional("Windows 10", 64);
        Sistemaoperacional sistemaoperacionalpromo3 = new Sistemaoperacional("Windows 10", 64);

        //Construção dos computadores
        //Computador sim é um vetor

        //Única entrada de dados é a opção de promoção que o usuário vai querer

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos pc vai comprar ? ");
        int quantidade = input.nextInt();
        int opcaopromo;

        for(int i = 0; i < quantidade; i++){
            System.out.println("Qual promoção vai selecinar ? Caso deseje encerrar compra,digite 0");
            opcaopromo = input.nextInt();
            if(opcaopromo == 1){



            }

            else if(opcaopromo == 2){

            }

            else if(opcaopromo == 3){

            }

            else{
                break;
            }
        }

        ProcessarPedido.exeutarPedido(computador);


















    }
}