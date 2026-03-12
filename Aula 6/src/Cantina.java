public class Cantina {
    String nome;
    Salgado [] salgados = new Salgado[3];  //array

    void addSalgado(Salgado salgado){
        for(int i = 0; i < salgados.length;i++){
            if(salgados[i] == null){        //tipo não primitivo preciso fazer isso
                salgados[i] = salgado;
                break;  //sair do loop
            }

        }
    }
    void mostrarInfo(){
        for(Salgado salgado : salgados){
            if(salgado != null){
                System.out.println(salgado.nome);
            }

        }
    }
}
