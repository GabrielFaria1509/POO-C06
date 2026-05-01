import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Inicialização das estruturas
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Map<Integer, Integer> hashMap = new HashMap<>();

        int totalElementos = 100000;
        long inicio, fim;

        //Teste array list
        inicio = System.currentTimeMillis();
        for (int i = 0; i < totalElementos; i++) {
            arrayList.add(i);
        }
        fim = System.currentTimeMillis();
        System.out.println("ArrayList - Inserção: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < totalElementos; i++) {
            arrayList.contains(i); // Busca
        }
        fim = System.currentTimeMillis();
        System.out.println("ArrayList - Busca: " + (fim - inicio) + "ms");

        //Teste hashset
        inicio = System.currentTimeMillis();
        for (int i = 0; i < totalElementos; i++) {
            hashSet.add(i);
        }
        fim = System.currentTimeMillis();
        System.out.println("HashSet - Inserção: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < totalElementos; i++) {
            hashSet.contains(i); // Busca
        }
        fim = System.currentTimeMillis();
        System.out.println("HashSet - Busca: " + (fim - inicio) + "ms");

        //Teste Hashmap
        inicio = System.currentTimeMillis();
        for (int i = 0; i < totalElementos; i++) {
            hashMap.put(i, i);
        }
        fim = System.currentTimeMillis();
        System.out.println("HashMap - Inserção: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < totalElementos; i++) {
            hashMap.containsKey(i); // Busca pela chave
        }
        fim = System.currentTimeMillis();
        System.out.println("HashMap - Busca: " + (fim - inicio) + "ms");
    }
}