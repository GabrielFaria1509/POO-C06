package Banda;

import Empresario.Empresario;
import Membro.Membro;
import Música.Música;

public class Banda {
    private String nome;
    private String genero;
    private Empresario empresario; //Agregação = Banda pode ou não ter um empresário
    private Membro[] membros = new Membro[5];  //agregação com vetor  //já inicializado posições com NULL
    private Música[] musicas = new Música[5]; //agregação com vetor //já inicializado


    //Construtor
    public Banda(String genero, String nome) {
        this.genero = genero;
        this.nome = nome;
    }

    //Getters ae Setters
    public Empresario getEmpresario() {
        return empresario;
    }

    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Getter e Setter para vetor membros
    public Membro[] getMembros() {
        return membros;
    }
    public void setMembros(Membro[] membros) {
        this.membros = membros;
    }

    //Getter e Setter para vetor músicas
    public Música[] getMusicas() {
        return musicas;
    }
    public void setMusicas(Música[] musicas) {
        this.musicas = musicas;
    }

    public void addMembroNovo(Membro membro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = membro;
                System.out.println("Membro " + membro.getNome() + " adicionado no banda!");
                return;
            }
        }

        System.out.println("Banda cheia");

    }
    public void addMusicaNova(Música musica){
        for(int j = 0; j < musicas.length; j++){
            if(musicas[j] == null){  //se estiver NULL posso manipular e colocar algo dentro da memória
                musicas[j] = musica;
                System.out.println("Música " + musicas[j].getNome() + " adicionada!");
                return;
            }

        }

        System.out.println("Repertório cheio");

    }

    public void mostarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);

        for(int j = 0; j < membros.length; j++){
            if(membros[j] != null){  //verifico se há um obejto válido
                System.out.println("Membro : " + membros[j].getNome() + "Função : " + membros[j].getFuncao());
            }
        }

        for(int j = 0; j < musicas.length; j++){
            if(musicas[j] != null){
                System.out.println("Música : " + musicas[j].getNome() + "Duração : " + musicas[j].getDuracao());
            }
        }
    }
}
