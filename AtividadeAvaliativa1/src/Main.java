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
        Computador[] computador=  new Computador[5]; //crio o vetor para receber os computadores\\
        //cliente compra mais de um pc ent pc é um vetor
        //computador tem um vetor com vários pc,cada pc tem um vetor de hardware

        //crio agora cada as opções dos produtos


        //cada hardware tem 3 peças->melhor usar vetor

        // Hardwares da Promoção 1
        HardwareBasico[] hwsPromo1 = new HardwareBasico[3];
        hwsPromo1[0] = new HardwareBasico("Pentium Core i3", 2200);
        hwsPromo1[1] = new HardwareBasico("Memória RAM", 8);
        hwsPromo1[2] = new HardwareBasico("HD", 500);


        HardwareBasico[] hwsPromo2 = new HardwareBasico[3];
        hwsPromo2[0] = new HardwareBasico("Pentium Core i5", 3370);
        hwsPromo2[1] = new HardwareBasico("Memória RAM", 16);
        hwsPromo2[2] = new HardwareBasico("HD", 1000);

        //Promo3
        HardwareBasico[] hwsPromo3 = new HardwareBasico[3];
        hwsPromo2[0] = new HardwareBasico("Pentium Core i7", 4500);
        hwsPromo2[1] = new HardwareBasico("Memória RAM", 32);
        hwsPromo2[2] = new HardwareBasico("HD", 2000);

        //Sistema operacional não é vetor
        Sistemaoperacional sistemaoperacional1promo1 = new Sistemaoperacional("MacOS Sequoia", 64);
        Sistemaoperacional sistemaoperacional2promo2 = new Sistemaoperacional("Windows 10", 64);
        Sistemaoperacional sistemaoperacionalpromo3 = new Sistemaoperacional("Windows 10", 64);

        MemoriaUSB memoriaUSBPromo1 = new MemoriaUSB("Pend-Drive",16);
        MemoriaUSB memoriaUSBPromo2 = new MemoriaUSB("Pend-Drive",32);
        MemoriaUSB memoriaUSBPromo3 = new MemoriaUSB("HD Externo",1000);


        //Construção dos computadores
        //Computador sim é um vetor

        //Única entrada de dados é a opção de promoção que o usuário vai querer
        Scanner input = new Scanner(System.in);
        int opcaopromo;
        String opcaomemo;

        for(int i = 0; i < computador.length; i++){
            System.out.println("Qual promoção vai selecinar ? Caso deseje encerrar compra,digite 0");
            opcaopromo = input.nextInt();
            input.nextLine(); //limpar buffer,evitar pegar espaço vazio na entrada

            if(opcaopromo == 1){
                Computador computador1 = new Computador(sistemaoperacional1promo1,hwsPromo1);
                computador1.setMarca("Apple");
                computador1.setPreco(757);
                System.out.println("Deseja memória USB a mais ?(Sim/Não)");
                opcaomemo = input.nextLine();
                if(opcaomemo.equalsIgnoreCase("Sim")){
                    computador1.setMemoriaUSB(memoriaUSBPromo1);
                }
                computador[i] = computador1;

                //Cliente escolheu pc com primeira config
            }
            else if(opcaopromo == 2){
                Computador computador2 = new Computador(sistemaoperacional2promo2,hwsPromo2);
                computador2.setMarca("Samsung");
                computador2.setPreco(1991);
                System.out.println("Deseja memória USB a mais ?(Sim/Não)");
                opcaomemo = input.nextLine();
                if(opcaomemo.equalsIgnoreCase("Sim")){
                    computador2.setMemoriaUSB(memoriaUSBPromo2);
                }
                computador[i] = computador2;
            }
            else if(opcaopromo == 3){
                Computador computador3 = new Computador(sistemaoperacionalpromo3,hwsPromo3);
                computador3.setMarca("Dell");
                computador3.setPreco(6435);
                System.out.println("Deseja memória USB a mais ?(Sim/Não)");
                opcaomemo = input.nextLine();
                if(opcaomemo.equalsIgnoreCase("Sim")){
                    computador3.setMemoriaUSB(memoriaUSBPromo3);
                }

                computador[i] = computador3;
            }
            else{
                break;
            }

        }

        System.out.println("Resumo da compra");

        for(int i = 0; i < computador.length; i++){
            if(computador[i] != null){
                System.out.println("Computador " + (i+1) + ":");
                computador[i].MostraPCConfigs();
            }
        }
        ProcessarPedido.exeutarPedido(computador);

        input.close();
    }
}