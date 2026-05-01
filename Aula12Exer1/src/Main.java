import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Double> listaDeDouble = new ArrayList<Double>();

        Random rand = new Random();

        for(int i = 0;i < 5;i++){
            Double aleatorio = rand.nextDouble(10);
            listaDeDouble.add(aleatorio);
        }

        Collections.sort(listaDeDouble,Collections.reverseOrder());

        System.out.println(listaDeDouble);

    }
}