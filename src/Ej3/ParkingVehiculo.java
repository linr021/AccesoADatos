package Ej3;

public class ParkingVehiculo implements Parking{
    private final double PRECIO_POR_MINUTO = 0.0425;
    private final int MAX_PLAZAS = 100;
    
    private String sDireccion;
    private int iPlazasOcupadas;
    
    public ParkingVehiculo() {
        this.sDireccion = "Calle de la Buenaventura, 20";
        this.iPlazasOcupadas = 0;
    }
    
    public boolean existePlaza() {
        return iPlazasOcupadas < MAX_PLAZAS;
    }
    
    public void aparcaCoche(Vehiculo vehiculo) {
        if (existePlaza()) {
            iPlazasOcupadas++;
            System.out.println("El coche con matrícula " + vehiculo.getMatricula() + " ha sido aparcado en el parking.");
        } else {
            System.out.println("No existen plazas disponibles en este momento.");
        }
    }
    
    public void sacaCoche(Vehiculo vehiculo) {
        if (iPlazasOcupadas > 0) {
            iPlazasOcupadas--;
            
        } else {
            System.out.println("No h sido posibe retirar el vehículo");
        }
    }
    
    public double getFactura(Vehiculo vehiculo) {
        double tiempoAparcamiento = Math.random() * 120;;
        double importe = tiempoAparcamiento * PRECIO_POR_MINUTO;
        return importe;
        
    }
    
}
