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
        //compuatador tem um vetor de vários hardware básico feita de hardwares isolados,não um vetor de hardware

        //crio agora cada as opções dos produtos

        //Promo1
        // Hardwares da Promoção 1
        HardwareBasico hw1_promo1_cpu = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico hw2_promo1_RAM = new HardwareBasico("Memória RAM", 8);
        HardwareBasico hw3_promo1_ssd = new HardwareBasico("HD", 500);

        //Promo2
        // Hardwares da Promoção 2
        HardwareBasico hw1_promo2_cpu = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico hw2_promo2_RAM = new HardwareBasico("Memória RAM", 16);
        HardwareBasico hw3_promo2_ssd = new HardwareBasico("HD", 1000);

        //Promo3
        // Hardwares da Promoção 3
        HardwareBasico hw1_promo3_cpu = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico hw2_promo3_RAM = new HardwareBasico("Memória RAM", 32);
        HardwareBasico hw3_promo3_ssd = new HardwareBasico("HD", 2000);

        //Sistema operacional não é vetor em si
        Sistemaoperacional sistemaoperacional1promo1 = new Sistemaoperacional("MacOS Sequoia", 64);
        Sistemaoperacional sistemaoperacional2promo2 = new Sistemaoperacional("Windows 10", 64);
        Sistemaoperacional sistemaoperacionalpromo3 = new Sistemaoperacional("Windows 10", 64);

        //Memoria USB não é um vetor em si
        MemoriaUSB memoriaUSB1promo1 = new MemoriaUSB("Pen-drive",16);
        MemoriaUSB memoriaUSB2promo2 = new MemoriaUSB("Pen-drive",32);
        MemoriaUSB memoriaUSB3promo3 = new MemoriaUSB("HD Extermo",1000);

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