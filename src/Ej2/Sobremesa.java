package Ej2;

public class Sobremesa extends Ordenador{

    private String sTipoTorre;

    public Sobremesa(int iRam, String sPorcesador, double dPrecio, String sTipoTorre) {
        super(iRam, sPorcesador, dPrecio);
        this.sTipoTorre=sTipoTorre;
    }

    public String getsTipoTorre() {
        return sTipoTorre;
    }

    public void setsTipoTorre(String sTipoTorre) {
        this.sTipoTorre = sTipoTorre;
    }

    @Override
    public String toString() {
        return super.toString()+ "Sobremesa [sTipoTorre=" + sTipoTorre + "]";
    }

    @Override
    public String getCaracteristicas() {
        return "Ram: "+iRam+" GB"+"\nProcesador: "+ sPorcesador+"\nPrecio: "+dPrecio+" euros"+"\nTipoTorre: "+sTipoTorre;
    }
    
    
}
