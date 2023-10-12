package Ej1;

public class ComplejoTest {

    public static void main(String[] args) {
        Complejo c1= new Complejo();
        Complejo c2= new Complejo();
        Complejo c3=new Complejo();

        
        c1.asignar(2.0, 15.0);
        c2.asignar(6.0, 10.0);

        c3.complejoSumar(c1, c2);
        c3.imprimir();


    }
    
}
