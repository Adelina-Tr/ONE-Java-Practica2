//Importacion de Clase Pelicula desde un paquete especifico
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        //Instancia de la clase com.aluracursos.screenmatch.modelos.Pelicula
        Pelicula miPelicua = new Pelicula();

        //Asignacion de valores a los atributos del objeto 'miPelicula"
        miPelicua.setNombre("Encanto");
        miPelicua.setFechaDeLanzamiento(2021);
        miPelicua.setDuracionEnMinutos(120);
        miPelicua.muestraFichaTecnica();

        //Uso de funciones de la Clase 'miPelicula"
        miPelicua.evalua(9.75);//Aniadimos nota
        miPelicua.evalua(9.25);//Aniadimos nota
        System.out.println("Total de evaluaciones: "+miPelicua.getTotalDeEvaluaciones());//getter
        System.out.println("Evaluacion promedio: "+miPelicua.calculaMedia()+"\n");

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
        System.out.println("Duracion en minutos: "+casaDragon.getDuracionEnMinutos()+"\n");//Uso de Getter

        //Otra instancia del tipo Pelicula
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        //Probando funcionalidades de la clase Calculadora
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicua);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: "
                + calculadora.getTiempoTotal() + " minutos");









//
//        //Uso de funciones de la Clase
//        otraPelicula.evalua(8.5);
//        otraPelicula.evalua(9.5);
//        System.out.println(otraPelicula.getTotalDeEvaluaciones());//getter
//        System.out.println(otraPelicula.calculaMedia());

    }
}
