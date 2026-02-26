//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Faria";
        zumbi2.nome = "Farinha";

        zumbi1.andar();
        zumbi2.andar();

        zumbi2.atacar();
        zumbi1.atacar();
    }
}