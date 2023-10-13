package EjerciciosClase.Ej4Clase;

import java.util.ArrayList;

public class InstitutoTestLindaFunez {
    public static void main(String[] args) {

        try{
        Profesor profeAlmudena= new Profesor("Almudena", 
        35, "2.6", "FOL");
        Profesor profeSergio= new Profesor("Sergio", 38, 
        "B4", "Sistemas Informáticos");
        Profesor profeDavid= new Profesor("David", 46, 
        "2.6", "Programación");

        ArrayList<Profesor>ListaProfesores=new ArrayList<Profesor>();
        ListaProfesores.add(profeDavid);
        ListaProfesores.add(profeSergio);
        ListaProfesores.add(profeAlmudena);
        System.out.println(ListaProfesores);

        Alumnos alumnaAgripina = new Alumnos("Agripina", 20, 
        "2.6", 5);
        Alumnos alumnoBaldomero = new Alumnos("Baldomero", 32, "B5",
         9);
        Alumnos alumnoCalixto = new Alumnos("Calixto", 18, "2.7",
         4);
        Alumnos alumnaHerminia = new Alumnos("Herminia", 19, "B3",
         7);

         ArrayList<Alumnos>ListaAlumnos= new ArrayList<Alumnos>();
         ListaAlumnos.add(alumnaHerminia);
         ListaAlumnos.add(alumnaAgripina);
         ListaAlumnos.add(alumnoBaldomero);
         ListaAlumnos.add(alumnoCalixto);
        System.out.println(ListaAlumnos);

         Aula aula26= new Aula("2.6", 4, ListaProfesores, ListaAlumnos);
            System.out.println("Aula 2.6 incluye "+aula26);
        } catch (Exception e){
            System.out.println("¡Error!");

        }
    }
    
}
