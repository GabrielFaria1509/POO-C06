public class Piloto {
    String nome;
    boolean vilao;
    Kart carro;  //agregação  //pioto pode ou nãi ter um carro do tipo Kart

    public void soltaSuperPoder(){
        System.out.println("Nome : " + nome);
        System.out.println("Vilão : " + vilao);
        System.out.println("O(a) " + nome  + " usou um super !");
    }
}
