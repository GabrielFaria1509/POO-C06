package processamentopedidos;

import computador.Computador;

public class ProcessarPedido {


    //Metódo utilitário == não depende de objetos
    public static void exeutarPedido(Computador[] computadores){
       System.out.println("Processando pedidos");

       for(Computador c : computadores){
           if(c != null){  //preciso verificar se consigo acessar aquele endereço de memória ou é null
               System.out.println("Pedido enviado ! ");
           }

       }

   }
}
