//Importacion de Clase Pelicula desde un paquete especifico
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        //Instancia de la clase com.aluracursos.screenmatch.modelos.Pelicula
        Pelicula miPelicula = new Pelicula();

        //Asignacion de valores a los atributos del objeto 'miPelicula"
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.muestraFichaTecnica();

        //Uso de funciones de la Clase 'miPelicula"
        miPelicula.evalua(9.75);//Aniadimos nota
        miPelicula.evalua(9.25);//Aniadimos nota
        System.out.println("Total de evaluaciones: "+ miPelicula.getTotalDeEvaluaciones());//getter
        System.out.println("Evaluacion promedio: "+ miPelicula.calculaMedia()+"\n");

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
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: "
                + calculadora.getTiempoTotal() + " minutos \n");

        //Probando funcionalidad del Filtro de Recomendacion en una Pelicula
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        System.out.print(miPelicula.getNombre());
        filtroRecomendacion.filtra(miPelicula);

        //Probando funcionalidad del Filtro de Recomendacion en un Episodio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targarven");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);
        System.out.print(episodio.getNombre());
        filtroRecomendacion.filtra(episodio);









//
//        //Uso de funciones de la Clase
//        otraPelicula.evalua(8.5);
//        otraPelicula.evalua(9.5);
//        System.out.println(otraPelicula.getTotalDeEvaluaciones());//getter
//        System.out.println(otraPelicula.calculaMedia());

    }
}
