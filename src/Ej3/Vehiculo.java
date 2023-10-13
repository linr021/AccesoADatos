package Ej3;
import java.util.Date;

public class Vehiculo {
    private String sMatricula;
    private Date dFechaInicio;
    private Date dFechaFin;
    
    public Vehiculo(String paramMatricula) {
        this.sMatricula = paramMatricula;
        this.dFechaInicio = new Date();
        this.dFechaFin = null;
    }
    
    public String getMatricula() {
        return sMatricula;
    }
    
    public void setMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }
    
    public Date getFechaInicio() {
        return dFechaInicio;
    }
    
    public void setFechaInicio(Date dFechaInicio) {
        this.dFechaInicio = dFechaInicio;
    }
    
    public Date getFechaFin() {
        return dFechaFin;
    }
    
    public void setFechaFin(Date dFechaFin) {
        this.dFechaFin = dFechaFin;
    }
    
    public String toString() {
        return "Matrícula: " + sMatricula + "\nFecha de inicio: " + dFechaInicio + "\nFecha de fin: " + dFechaFin;
    }
}
