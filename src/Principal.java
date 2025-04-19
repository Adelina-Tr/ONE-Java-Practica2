public class Principal {

    public static void main(String[] args) {

        //Instancia de una Pelicula
        Pelicula miPelicua = new Pelicula();

        //Asignacion de valores a los atributos del objeto
        miPelicua.nombre = "Encanto";
        miPelicua.fechaDeLanzamiento = 2021;
        miPelicua.duracionEnMinutos = 120;

        //Imprimir valores de los atributos del objeto 'miPelicula'
        System.out.println("Mi pelicula es: "+miPelicua.nombre);
        System.out.println("Su fecha de lanzamiento es: "+miPelicua.fechaDeLanzamiento);
        System.out.println("Su duracion en minnutos es "+miPelicua.duracionEnMinutos);

        //Otra instancia del tipo Pelicula
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        //Imprimir valores de los atributos del objeto 'otraPelicula'
        System.out.println("Mi pelicula es: "+otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: "+otraPelicula.fechaDeLanzamiento);
        System.out.println("Su duracion en minnutos es "+otraPelicula.duracionEnMinutos);





    }
}
