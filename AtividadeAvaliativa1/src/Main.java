//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in tim=
//import dos pacotes


import cliente.Cliente;
import hardware.HardwareBasico;
import memoriausb.MemoriaUSB;
import os.Sistemaoperacional;
import computador.Computador;

public class Main {
    public static void main(String[] args) {
        //Instanciando classes
        Cliente cliente = new Cliente(1316546414,"Gabriel"); //crio o cliente
        Computador[] computador =  new Computador[3]; //crio o vetor para receber os computadores\\
        //cliente compra mais de um pc ent pc é um vetor
        //compuatador tem um vetor de vários hardware básico feita de hardwares isolados,não um vetor de hardware

        //crio agora cada as opções dos produtos

        //hardwareBasico em si não é vetor
        HardwareBasico hardwareBasico1 = new HardwareBasico(8.500F,"Pentium Core i3,Memória RAM ou HD");
        //F é para sinalziar que é float
        HardwareBasico hardwareBasico2 = new HardwareBasico(16.1000F,"Pentium Core i5,Memória RAM ou HD");
        HardwareBasico hardwareBasico3 = new HardwareBasico(32.2000F,"Pentium Core i7,Memória RAM ou HD");

        //Sistema operacional não é vetor em si
        Sistemaoperacional sistemaoperacional1 = new Sistemaoperacional(64,"MacOS Sequoia");
        Sistemaoperacional sistemaoperacional2 = new Sistemaoperacional(64,"Windows 10");

        //Memoria USB não é um vetor em si

        MemoriaUSB memoriaUSB1 = new MemoriaUSB(16,"Pen-drive");
        MemoriaUSB memoriaUSB2 = new MemoriaUSB(32,"Pen-drive");
        MemoriaUSB memoriaUSB3 = new MemoriaUSB(1000,"HD Extermo");

        //Construção dos computadores
        //Computador sim é um vetor

        //Única entrada de dados é a opção de promoção que o usuário vai querer















    }
}