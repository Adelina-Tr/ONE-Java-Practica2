public class Pelicula {

    //Propiedades de la clase
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean inclidoEnElPlan;
    double sumaDeEvaluaciones;
    int totalDeEvaluaciones;

    //Metodo que imprime los valores de cada atributo de la clase
    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+nombre);
        System.out.println("Su fecha de lanzamiento es: "+fechaDeLanzamiento);
        System.out.println("Su duracion en minnutos es "+duracionEnMinutos);
    }
    //Metodo que aniade notas tipo doble
    void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeEvaluaciones++;
    }
    //Metodo que calcula el promedio del total de notas
    double calculaMedia(){
        return sumaDeEvaluaciones/totalDeEvaluaciones;
    }
}
