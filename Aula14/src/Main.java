import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Imports


public class Main {
    public static void main(String[] args) throws IOException {
        //Óbtem o arquivo
        Path arquivo = Paths.get("professores_disciplina.txt");
        try{
            List<String>conteudo = Files.readAllLines(arquivo); //Leio arquivo
            Map<String,String> conifg = new HashMap<>(); //para armazenar conteúdo

            conteudo.forEach((linha) -> { //For para cada linha do arquivo
                String[] linhaquebrada= linha.split("=");//(strip)Quebro quando acho =
                conifg.put(linhaquebrada[0],linhaquebrada[1].strip());
                System.out.println("Professor : " + linhaquebrada[0] + "Matéria : " + linhaquebrada[1]);
            });




        }catch (IOException e)  { //trata exceção
            e.printStackTrace();
        }

}
}