//Importacion de Clase Pelicula desde un paquete especifico
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        //Instancia de la clase com.aluracursos.screenmatch.modelos.Pelicula
        Pelicula miPelicua = new Pelicula();

        //Asignacion de valores a los atributos del objeto
        miPelicua.setNombre("Encanto");
        miPelicua.setFechaDeLanzamiento(2021);
        miPelicua.setDuracionEnMinutos(120);
        miPelicua.muestraFichaTecnica();

        //Uso de funciones de la Clase
        miPelicua.evalua(9.75);
        miPelicua.evalua(9.25);
        System.out.println(miPelicua.getTotalDeEvaluaciones());//getter
        System.out.println(miPelicua.calculaMedia());

        //Instancia de serie Casa Dragon y modificacion de sus atributos
        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporadas(10);

        //Se imprime ficha tecnica
        casaDragon.muestraFichaTecnica();

        //Quiero saber cual es la duracion total en minutos de la serie
        System.out.println(casaDragon.getDuracionEnMinutos());





//        //Otra instancia del tipo com.aluracursos.screenmatch.modelos.Pelicula
//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//
//        //Asignacion de valores a los atributos del objeto
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//        otraPelicula.muestraFichaTecnica();
//
//        //Uso de funciones de la Clase
//        otraPelicula.evalua(8.5);
//        otraPelicula.evalua(9.5);
//        System.out.println(otraPelicula.getTotalDeEvaluaciones());//getter
//        System.out.println(otraPelicula.calculaMedia());

    }
}
