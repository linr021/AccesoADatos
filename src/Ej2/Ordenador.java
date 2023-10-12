package Ej2;

public abstract class Ordenador {
    protected int iRam;
    protected String sPorcesador;
    protected double dPrecio;



    public Ordenador(int iRam, String sPorcesador, double dPrecio) {
        this.iRam = iRam;
        this.sPorcesador = sPorcesador;
        this.dPrecio = dPrecio;
    }



    public int getiRam() {
        return iRam;
    }



    public void setiRam(int iRam) {
        this.iRam = iRam;
    }



    public String getsPorcesador() {
        return sPorcesador;
    }



    public void setsPorcesador(String sPorcesador) {
        this.sPorcesador = sPorcesador;
    }



    public double getdPrecio() {
        return dPrecio;
    }



    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    public abstract String getCaracteristicas();



    @Override
    public String toString() {
        return "Ordenador [iRam=" + iRam + ", sPorcesador=" + sPorcesador + ", dPrecio=" + dPrecio + "]";
    }

    
    

    
}
