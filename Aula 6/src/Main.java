//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina Inatel";

        Salgado s1 = new Salgado();
        s1.nome = "Esfirra";

        Salgado s2 = new Salgado();
        s2.nome = "Coxinha";

        Salgado s3 = new Salgado();
        s3.nome = "Pastel";

        Salgado s4 = new Salgado();
        s4.nome = "Kibe";

        cantina.addSalgado(s1);
        cantina.addSalgado(s2);
        cantina.addSalgado(s3);
        cantina.addSalgado(s4);

        cantina.mostrarInfo();


    }
}