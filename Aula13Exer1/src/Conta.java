import java.util.HashSet;

public class Conta {
    private int limite;
    private int saldo;
    private HashSet<Cliente>clientes;


    //Construtor
    public Conta(int limite, int saldo) {
        this.limite = limite;
        this.saldo = saldo;
        this.clientes = new HashSet<>();
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void mosrarInfro(){
        for(Cliente cliente : this.clientes){
            cliente.mostraInfoCliente();

            try{
                cliente.mostarInfoCliente();
            }catch (NullPointerException e){
                e.getMessage();
            }
        }


    }
}
