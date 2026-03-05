public class Zumbi {
    String nome;
    double vida;

    public void andar(){
        System.out.println(nome + " está andando");
    }

    public double mostrarVida(){
        return vida;
    }

    public void info(){
        System.out.println("Nome zumbi :" + nome);
        System.out.println("Vida :" + vida);
    }

    public void transfereVida(Zumbi receptor,double quantia){
        vida-=quantia;
        receptor.vida += quantia;
        System.out.println("Vida atual após a perca : " + vida);
    }


}
