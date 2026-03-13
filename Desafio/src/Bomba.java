public class Bomba {
    boolean ativo;
    int levelbomba;
    int dano;

    void MostrarStatus(){
        if (ativo = true){
            System.out.println("Bomba ativa  colocada ativa");
            System.out.println("Dano: " + dano);
            System.out.println("Level : " + levelbomba);
        }else{
            System.out.println("Bomba inativa colcoada");
        }
    }
}
