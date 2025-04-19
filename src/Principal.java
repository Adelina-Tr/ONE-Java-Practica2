public class Principal {

    public static void main(String[] args) {

        //Instancia de la clase Pelicula
        Pelicula miPelicua = new Pelicula();

        //Asignacion de valores a los atributos del objeto
        miPelicua.nombre = "Encanto";
        miPelicua.fechaDeLanzamiento = 2021;
        miPelicua.duracionEnMinutos = 120;
        miPelicua.muestraFichaTecnica();

        //Aniadir notas de evaluacion
        miPelicua.evalua(9.75);
        miPelicua.evalua(9.25);
        System.out.println(miPelicua.sumaDeEvaluaciones);
        System.out.println(miPelicua.calculaMedia());

        //Otra instancia del tipo Pelicula
        Pelicula otraPelicula = new Pelicula();

        //Asignacion de valores a los atributos del objeto
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;
        otraPelicula.muestraFichaTecnica();

        //Aniadir notas de evaluacion
        otraPelicula.evalua(8.5);
        otraPelicula.evalua(9.5);
        System.out.println(otraPelicula.sumaDeEvaluaciones);
        System.out.println(otraPelicula.calculaMedia());

    }
}
