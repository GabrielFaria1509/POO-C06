//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new Conta(1000,3000);
        Cliente cliente1 = new Cliente("faria");
        Cliente cliente2 = new Cliente("Jão");
        Cliente cliente3 = null;

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mosrarInfo();

        double valor = 500;

        try {  //tento executar metodo
            conta.sacar(5000);
        } catch (SaldoInsuficienteException e) {  //Classe de exceção tem a instância e
            System.out.println(e.getMessage()); //uso getter part apegar a mensagem perosnalizada que a classe de exceção recebeu
        }

        System.out.println("Código executado até o final");
    }
}