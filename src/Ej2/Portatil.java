package Ej2;

public class Portatil extends Ordenador {

    private int dPeso;

    public Portatil(int iRam, String sPorcesador, double dPrecio, int dPeso) {
        super(iRam, sPorcesador, dPrecio);
        this.dPeso=dPeso;
       
    }

    public int getdPeso() {
        return dPeso;
    }

    public void setdPeso(int dPeso) {
        this.dPeso = dPeso;
    }

    

    @Override
    public String toString() {
        return super.toString() + "Portatil [dPeso=" + dPeso + "]";
    }

    @Override
    public String getCaracteristicas() {
        return "Ram: "+iRam+" GB"+"\nProcesador: "+ sPorcesador+"\nPrecio: "+dPrecio+" euros"+"\nPeso: "+dPeso+" gramos";
    }

    
    
}
