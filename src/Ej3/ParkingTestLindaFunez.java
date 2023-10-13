package Ej3;

import java.util.ArrayList;

public class ParkingTestLindaFunez {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("7685SWL");
        Vehiculo vehiculo2 = new Vehiculo("1516RFX");
        Vehiculo vehiculo3 = new Vehiculo("1296QOG");
        Vehiculo vehiculo4 = new Vehiculo("7471FFP");
        Vehiculo vehiculo5 = new Vehiculo("9369ORT");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);
        vehiculos.add(vehiculo5);

        ParkingVehiculo parking= new ParkingVehiculo();

        for (Vehiculo vehiculo : vehiculos) {
            if (parking.existePlaza()) {
                parking.aparcaCoche(vehiculo);
                System.out.println("El vehículo con matrícula " + vehiculo.getMatricula() + " ha sido aparcado.");
            } else {
                System.out.println("No hay plazas disponibles para el vehículo con matrícula " + vehiculo.getMatricula() + ".");
            }
        }
        
        for (Vehiculo vehiculo : vehiculos) {
            parking.sacaCoche(vehiculo);
            double factura = parking.getFactura(vehiculo);
            System.out.println("El vehículo con matrícula " + vehiculo.getMatricula() + " ha sido sacado del parking.");
            System.out.println("La factura a pagar es de " + factura + " euros.");
        
        
    }

    
}
}
