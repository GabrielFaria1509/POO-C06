public class SaldoInsuficienteException extends  Exception{  //herda da classe de exceçao checked

    // Usando o construtor da superclasse para receber a mensagem
    public SaldoInsuficienteException(String message){
        super(message);
    }
}
