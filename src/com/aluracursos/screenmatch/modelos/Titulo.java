package com.aluracursos.screenmatch.modelos;

public class Titulo {

    //Propiedades de la clase
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean inclidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalDeEvaluaciones;


    //Generacion de Getters
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isInclidoEnElPlan() {
        return inclidoEnElPlan;
    }
    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    //Generacion de Setters
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInclidoEnElPlan(boolean inclidoEnElPlan) {
        this.inclidoEnElPlan = inclidoEnElPlan;
    }

    //Metodo que imprime los valores de cada atributo de la clase
    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+nombre);
        System.out.println("Su fecha de lanzamiento es: "+fechaDeLanzamiento);
        System.out.println("Su duracion en minutos es "+duracionEnMinutos);
    }
    //Metodo que aniade notas tipo doble
    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeEvaluaciones++;
    }
    //Metodo que calcula el promedio del total de notas
    public double calculaMedia(){
        return sumaDeEvaluaciones/totalDeEvaluaciones;
    }
}
