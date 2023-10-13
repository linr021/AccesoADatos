package EjerciciosClase.Ej4Clase;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula {
    private String sNombreAula;
    private int iNumEstudiantes;
    private ArrayList<Profesor> profes;
    private ArrayList<Alumnos> alumnos;
    private ArrayList<String> materias;

    public Aula(String paramNombreAula, int paramNumEstudiantes, 
    ArrayList <Profesor> profes, ArrayList<Alumnos> alumnos
    ) throws Exception{
        this.iNumEstudiantes=paramNumEstudiantes;
        this.sNombreAula=paramNombreAula;
        
        
        if(iNumEstudiantes>Constantes.getMaxEstudiantes()){
            throw new Exception();
            
        }
        
        if (!Arrays.asList(Constantes.LISTA_AULAS).contains(sNombreAula)) {
            throw new Exception();
        }
        for(int i=0; i<profes.size(); i++){
            
            materias.add(profes.get(i).getsMateria());

            }
            
        this.profes=profes;
        this.alumnos=alumnos;
        
        }

    @Override
    public String toString() {
        return "AulaLindaFunez [sNombreAula=" + sNombreAula + ", iNumEstudiantes=" + iNumEstudiantes + ", profes="
                + profes + ", alumnos=" + alumnos + ", materias=" + materias + "]\n";
    }
}
    

