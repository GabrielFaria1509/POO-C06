package Blocos;

public class Bloco {
    static int numblocos = 0; //static==qualquer instância compartilha a variável
    private boolean destruido = false;


    //Getter
    public boolean isDestruido() {
        return destruido;
    }
    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    //Construtor
    public Bloco() {  //construtor com contador //toda vez que instanciar contador aumenta
        numblocos++;
    }

    public static void setNumblocos(int numblocos) {
        Bloco.numblocos = numblocos;
    }

    public static int getNumblocos() {     //todas instâncias de bloco compartilham esse getter
        return numblocos;
    }

    //Se um bloco for destrúido contagem diminui e passa a ser true a instância
    public void DiminuirBloco() {
        destruido = true;
        numblocos--;
    }
}
