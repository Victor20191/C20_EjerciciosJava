package b2;

import java.util.List;

public class Estudiante {

    //Metodo constructor
    public Estudiante(String nombre, String apellido,int edad, int id){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.id=id;
    }
    private String nombre;
    private  String apellido;
   private int edad;
    private int id;
    private int semestre;
     private String carrera;
    private List<Materias> materiasList;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }
}
