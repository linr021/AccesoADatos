package Ej2;

public class OrdenadorTest {

    public static void sumaPrecio(Ordenador o1, Ordenador o2){
        System.out.println(o1.getdPrecio()+o2.getdPrecio()+" euros"); 
    }
    

    public static void main(String[] args) {
        Portatil portatil1= new Portatil(16,"Intel Celeron", 329.0, 1500);
        Sobremesa sobremesa1= new Sobremesa(32, "Ryzen 9", 1250, "E-ATX");
        
        System.out.println(portatil1.getCaracteristicas()+"\n\s");
        System.out.println(sobremesa1.getCaracteristicas());
        
        sumaPrecio(portatil1,sobremesa1);
        
    }
    
}
