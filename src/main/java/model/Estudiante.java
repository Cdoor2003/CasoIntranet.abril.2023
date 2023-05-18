package model;

public class Estudiante {
    private String nombre;
    private String rut;
    private int numeroMatricula;
    private String carrera;

    public Estudiante(String nombre, String rut, int numeroMatricula, String carrera) {
        this.nombre = nombre;
        this.rut = rut;
        this.numeroMatricula = numeroMatricula;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String toString(){
        return nombre+","+rut+","+numeroMatricula;
    }
}
