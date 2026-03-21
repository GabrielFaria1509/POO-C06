package Motor;

public class Motor {
    private double potencia;
    private boolean ligado;


    //SETTERS
    public void setLigado(boolean ligado) {
        this.ligado = ligado;

        if (ligado) {  //booleano não precisar comparar com true
            System.out.println("Motor ligado");
        }else{
            System.out.println("Motor desligado");
        }
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    //GETTERS

    public double getPotencia() {
        return potencia;
    }

    public boolean isLigado() {  //boolean usa is
        return  ligado;
    }
}
