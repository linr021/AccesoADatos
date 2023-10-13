package EjerciciosClase.Ej4Clase;

public class Profesor extends Persona {
    private String sMateria;

    public Profesor(String paramNombre, int paramEdad, String paramAulaAsignada, String paramMateria) {
        super(paramNombre, paramEdad, paramAulaAsignada);
        this.sMateria=paramMateria;
    }

    public String getsMateria() {
        return sMateria;
    }

    public void setsMateria(String sMateria) {
        this.sMateria = sMateria;
    }

    @Override
    public String toString() {
        return super.toString()+ "ProfesorLindaFunez [sMateria=" + sMateria + "]";
    }
    
    
}
