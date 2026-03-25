import Banda.Banda;
import Empresario.Empresario;
import Membro.Membro;
import Música.Música;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda("Rock","Linkin Park");
        Empresario empresario = new Empresario(21321311,"Faria");
        empresario.setCnpj(21321311);
        empresario.setNome("Faria");
        banda.setEmpresario(empresario);  //vinculo empresario à banda


        Membro membro = new Membro("Vocalista","Emily");
        Membro membro2 = new Membro("Rapper/Multi-instrumentista","Mike");
        Membro membro3 = new Membro("Baixista","Dave");
        Membro membro4 = new Membro("DJ","Joe");
        Membro membro5 = new Membro("Baterista","Colin");

        banda.addMembroNovo(membro);  //adiciono os membros através do metodo
        banda.addMembroNovo(membro2);
        banda.addMembroNovo(membro3);
        banda.addMembroNovo(membro4);
        banda.addMembroNovo(membro5);

        Música musica = new Música(2.35,"Given up");
        Música musica2 = new Música(3.30,"In the end");
        Música musica3 = new Música(4.00,"Leave all the rest");
        Música musica4 = new Música(3.00,"Bleed it out");
        Música musica5 = new Música(3.25,"Burn it down");

        banda.addMusicaNova(musica);  //adiciona musica usando metódo adMusica
        banda.addMusicaNova(musica2);
        banda.addMusicaNova(musica3);
        banda.addMusicaNova(musica4);
        banda.addMusicaNova(musica5);

        banda.mostarInfo();
    }
}