package Ej4;

public class Punto3D extends Punto{

    private int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z=z;


    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double distancia(Punto3D otroPunto){

        double dX= Double.valueOf(this.getX());
        double dY= Double.valueOf(this.getY());
        double dZ= Double.valueOf(this.z);
        double dOX= Double.valueOf(otroPunto.getX());
        double dOY= Double.valueOf(otroPunto.getY());
        double dOZ= Double.valueOf(otroPunto.getZ());
        double distancia = Math.sqrt(Math.pow((dOX - dX), 2) + Math.pow((dOY - dY), 2)+Math.pow((dOZ - dZ), 2));
        
        return distancia;

    }

    
    public boolean esIgual3D(Punto3D p1, Punto3D p2){
        if(p1.equals(p2)){
            return true;
        }
        return  false;
    }


    

    
}
