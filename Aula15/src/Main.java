//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Contador1 cont1 = new Contador1();
    Contador2 con2 = new Contador2();
    Contador3 cont3 = new Contador3();

    Thread threadCont1 = new Thread(cont1);
    Thread threadCont2 = new Thread(con2);
    Thread threadCont3 = new Thread(cont3);

    threadCont1.start();
    threadCont2.start();
    threadCont3.start();

    }
}