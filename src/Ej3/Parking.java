package Ej3;

public interface Parking {
    boolean existePlaza();
    
    void aparcaCoche(Vehiculo vehiculo);
    
    void sacaCoche(Vehiculo vehiculo);
    
    double getFactura(Vehiculo vehiculo);
    
}
