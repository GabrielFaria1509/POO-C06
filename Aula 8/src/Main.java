import Cliente.Cliente;
import Conta.*;


public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[3];


        clientes[0] = new Cliente();
        clientes[0].setNome("Faria");

        clientes[1]= new Cliente();
        clientes[1].setNome("João");

        clientes[2] = new Cliente();
        clientes[2].setNome("Maria");

        Conta conta = new Conta();
        conta.setClientes(clientes);

        conta.getClientes()[0].setCpf(123677342);
        conta.getClientes()[1].setCpf(125343525);
        conta.getClientes()[2].setCpf(243458336);

        conta.setLimite(100000);
        conta.Depositar(10000);
        conta.Sacar(100);
    }
}