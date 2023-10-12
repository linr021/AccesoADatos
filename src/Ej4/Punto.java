package Ej4;

public class Punto {
    private int x;
    private int y;



    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    

    public int getX() {
        return x;
    }



    public void setX(int x) {
        this.x = x;
    }



    public int getY() {
        return y;
    }



    public void setY(int y) {
        this.y = y;
    }



    public double distancia(Punto otroPunto){

        double dX= Double.valueOf(this.x);
        double dY= Double.valueOf(this.y);
        double dOX= Double.valueOf(otroPunto.getX());
        double dOY= Double.valueOf(otroPunto.getY());
        double distancia = Math.sqrt(Math.pow((dOX - dX), 2) + Math.pow((dOY - dY), 2));

        return distancia;

    }


    public boolean esIgual(Punto p1, Punto p2){
        if(p1.equals(p2)){
            return true;
        }
        return  false;
    }

    
    
}
