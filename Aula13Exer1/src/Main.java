import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1000,3000);
        Cliente cliente1 = new Cliente("faria");
        Cliente cliente2 = new Cliente("Jão");
        Cliente cliente3 = null;

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mosrarInfo();

        System.out.println("Código executado até o final ! ");


    }
}