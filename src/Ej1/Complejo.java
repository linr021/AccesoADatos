package Ej1;

public class Complejo {
    double dPReal;
    double dPImag;


    public Complejo(double dPReal, double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    

    public Complejo() {
    }



    public void asignar(double x, double y){
        dPReal=x;
        dPImag=y;
       

    }

    public Complejo complejoSumar(Complejo c1, Complejo c2){
       dPReal=c1.dPReal+c2.dPReal;
        dPImag=c1.dPImag+c2.dPImag;
        Complejo ans = new Complejo(dPReal,dPImag);

        return ans;


    }

    public void imprimir() {
        System.out.println("Resultado de la suma: " + dPReal + " + " + dPImag + "i");
    }
    

    
    
    
    
}
