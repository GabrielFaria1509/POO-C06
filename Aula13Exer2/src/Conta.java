import java.util.HashSet;

public class Conta {
    private int limite;
    private int saldo;
    private HashSet<Cliente>clientes;


    //Construtor
    public Conta(int limite, int saldo) {
        this.limite = limite;
        this.saldo = saldo;
        this.clientes = new HashSet<>(); //Construtor para poder adicionar ao HashSet
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void mosrarInfo(){
        System.out.println("--- Informações da Conta ---");
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);


        for(Cliente cliente : this.clientes){
            //Tento afzer algo
            try{
                cliente.mostarInfoCliente();
            }catch (NullPointerException e){ //Capturo a exceção
                System.out.println("Erro : " + e);
            }
        }


    }

    public void sacar(double valor) throws  SaldoInsuficienteException{ //se uso throws sou obrigado a tratr exceção
        if (valor > (this.saldo + this.limite)) {
            // Lançando a exceção com a mensagem desejada(Envio ela para o construtor da classe de exceção personalizada)
            throw new SaldoInsuficienteException("Erro: Saldo e limite insuficientes para o saque!");
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque de R$ : " + valor + "realizado");
        }

    }
}