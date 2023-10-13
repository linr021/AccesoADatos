package EjerciciosClase.Ej4Clase;

public class Persona {
    /*Atributos*/
    private String sNombre;
    private int iEdad;
    private String sAulaAsignada;

    /*Constructores*/

    public Persona(String paramNombre, int paramEdad, String paramAulaAsignada) {
        this.sNombre = paramNombre;
        this.iEdad = paramEdad;
        this.sAulaAsignada = paramAulaAsignada;
    }
    @Override
    public String toString() {
        return "PersonaLindaFunez [sNombre=" + sNombre + ", iEdad=" + iEdad + ", sAulaAsignada=" + sAulaAsignada + "]\n";
    }
    
}
