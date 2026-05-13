public class Contador1 implements Runnable{

    @Override
    public void run(){
        System.out.println("Executando contador 1 !");

        int cont = 0;
        for(int i = 0; i < 1000;i++){
            cont+=1;
        }
    }
}
