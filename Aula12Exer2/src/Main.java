import classes.Filha1;
import classes.Filha2;
import classes.Filha3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filha1 f1 = new Filha1("Faria",22);
        Filha1 f2 = new Filha1("Isabella",18);
        Filha2 f3 = new Filha2("Jorge",20);
        Filha2 f4 = new Filha2("Isa",19);
        Filha3 f5 = new Filha3("Zé",30);
        Filha3 f6 = new Filha3("Luan",27);

        Map<String,Integer>mapapessoas = new HashMap<>();

        mapapessoas.put(f1.getNome(),f1.getIdade());
        mapapessoas.put(f2.getNome(),f2.getIdade());
        mapapessoas.put(f3.getNome(),f3.getIdade());
        mapapessoas.put(f4.getNome(),f4.getIdade());
        mapapessoas.put(f5.getNome(),f5.getIdade());
        mapapessoas.put(f6.getNome(),f6.getIdade());

        List<Integer> listaIdades = new ArrayList<>();

        // Inserindo as idades na lista
        listaIdades.add(f1.getIdade());
        listaIdades.add(f2.getIdade());
        listaIdades.add(f3.getIdade());
        listaIdades.add(f4.getIdade());
        listaIdades.add(f5.getIdade());
        listaIdades.add(f6.getIdade());

        Collections.sort(listaIdades);

        System.out.println(listaIdades);
    }
}