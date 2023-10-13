package EjerciciosClase.Ej4Clase;

public class Alumnos extends Persona {
    private int iNota;

    

    public Alumnos(String paramNombre, int paramEdad, String paramAulaAsignada, int paramNota) {
        super(paramNombre, paramEdad, paramAulaAsignada);
        this.iNota = paramNota;
    }



    public int getiNota() {
        return iNota;
    }



    public void setiNota(int iNota) {
        this.iNota = iNota;
    }



    @Override
    public String toString() {
        return super.toString()+"AlumnosLindaFunez [iNota=" + iNota + "]";
    }


    
}
