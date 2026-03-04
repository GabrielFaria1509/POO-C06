public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;     //instância motor do tipo Motor
    public Kart(){
        motor = new Motor();  //composição //preciso desse construtor

    }

    public void pular(){
        System.out.println("O kart" + nome + " está pulando ! ");
    }

    public void soltarTurbo(){
        System.out.println("Turbo usado por " + nome );
    }

    public void fazerDrift(){
        System.out.println("Drift realizado por " + nome);
    }

}
