# 🎬 ScreenMatch

## 📖 Descripción del Proyecto
ScreenMatch es un proyecto desarrollado en **Java 17** utilizando **IntelliJ IDEA**, como parte del curso _"Java: Aplicando la Orientación a Objetos"_ en la etapa **Tech Foundation** del **Programa Oracle Next Education** de **Alura Latam**.  
Este proyecto permite gestionar información sobre películas y series, aplicando los **principios de la Programación Orientada a Objetos (POO)** para estructurar y manipular datos de manera eficiente.

## 🎯 Objetivos del Proyecto
- Aplicar los **cuatro pilares de la POO**: **abstracción, encapsulamiento, herencia y polimorfismo**.
- Implementar **clases, objetos, atributos y métodos** para modelar películas y series.
- Utilizar **interfaces** para definir contratos de comportamiento.
- Manejar **paquetes** y **modificadores de acceso** para organizar el código de manera estructurada.
- Implementar **getters y setters** para controlar el acceso a los atributos.
- Aplicar **sobreescritura de métodos** con `@Override` para modificar comportamientos heredados.

## 📜 Tabla de Contenidos
1. [Estructura del Proyecto](#-estructura-del-proyecto)
2. [Conceptos Clave de POO](#-conceptos-clave-de-poo)
3. [Clases y Funcionalidad](#-clases-y-funcionalidad)
4. [Diagramas UML](#-diagramas-uml)
5. [Tecnologías Utilizadas](#-tecnologías-utilizadas)
6. [Instalación](#-instalación)
7. [Autora](#-autora)

## 📂 Estructura del Proyecto
El proyecto está organizado en los siguientes paquetes:

### `com.aluracursos.screenmatch.modelos`
Contiene las clases que representan los modelos del dominio, como títulos, películas y series:
- **`Titulo`**: Clase base con atributos comunes como `nombre`, `fechaDeLanzamiento` y `duracionEnMinutos`.
- **`Pelicula`**: Extiende `Titulo`, agregando el atributo `director` y la implementación de `Clasificacion`.
- **`Serie`**: Extiende `Titulo`, con atributos para `temporadas`, `episodiosPorTemporadas` y `minutosPorEpisodio`.
- **`Episodio`**: Representa episodios dentro de una serie, implementando `Clasificacion` para determinar su popularidad.

### `com.aluracursos.screenmatch.calculos`
Incluye clases utilitarias para cálculos y filtros, así como una interfaz para clasificación.:
- **`CalculadoraDeTiempo`**: Acumula el tiempo total necesario para ver los títulos.
- **`FiltroRecomendacion`**: Filtra los títulos según su clasificación.
- **`Clasificacion`** (Interfaz): Define un contrato para obtener clasificaciones.

### Clase Principal
Fuera de los paquetes mencionados, se encuentra la clase `Principal`, que actúa como **punto de entrada** al programa, probando las funcionalidades de los modelos y cálculos.

## 🔑 Conceptos Clave de POO
### 1. **Abstracción**
La abstracción se logra al simplificar los detalles complejos y mostrar solo la información esencial. En este proyecto, **la clase `Titulo`** actúa como una clase base para objetos más específicos como **`Pelicula`** y **`Serie`**, ocultando los detalles internos como las evaluaciones y el cálculo de la duración.

### 2. **Encapsulamiento**
El encapsulamiento se refiere a la ocultación de datos, asegurando que solo los métodos de la clase puedan acceder a sus atributos. En este proyecto, todos los atributos de las clases están marcados como `private`, lo que garantiza que no puedan ser modificados directamente desde fuera de la clase. Se utilizan métodos **getter** y **setter** para acceder y modificar los atributos.

### 3. **Herencia**
La herencia es el mecanismo mediante el cual una clase puede heredar propiedades y comportamientos de otra clase. **`Pelicula`** y **`Serie`** son subclases de **`Titulo`**, lo que significa que heredan todos los atributos y métodos de la clase `Titulo`. Esto permite reutilizar código y organizarlo mejor.

### 4. **Polimorfismo**
El polimorfismo permite que un objeto se comporte de diferentes maneras dependiendo de su tipo. En este proyecto, el método **`getClasificacion()`** se comporta de manera diferente dependiendo de si el objeto es una **película** o un **episodio**, lo que permite un comportamiento especializado para cada tipo de objeto.
## 🏗️ Clases y Funcionalidad
Cada clase tiene una finalidad específica dentro del proyecto:


### 1. `Titulo` (Clase Base)
La clase `Titulo` es la **superclase** y proporciona las propiedades y métodos comunes para todos los títulos, ya sean **películas** o **series**.

**Atributos:**
- `nombre`: Nombre del título (película o serie).
- `fechaDeLanzamiento`: Año de lanzamiento.
- `duracionEnMinutos`: Duración total en minutos.
- `incluidoEnElPlan`: Si el título está incluido en el plan de suscripción.
- `sumaDeEvaluaciones`: Suma total de todas las evaluaciones del título.
- `totalDeEvaluaciones`: Número total de evaluaciones.

**Métodos:**
- `muestraFichaTecnica()`: Muestra la información básica del título.
- `evalua(double nota)`: Registra una evaluación.
- `calculaMedia()`: Calcula el promedio de todas las evaluaciones.

### 2. `Pelicula` (Subclase de `Titulo`)

La clase `Pelicula` representa una película con un director; y **extiende** de `Titulo`, lo que significa que hereda todos los atributos y métodos de `Titulo`.  Hace uso de **polimorfismo** en la sobrecarga del método `getClasificacion()`.

**Atributos:**
- `director`: Director de la película.

**Métodos:**
- `getClasificacion()`: Retorna una clasificación basada en la media de las evaluaciones.

### 3. `Serie` (Subclase de `Titulo`)

La clase `Serie` representa una serie con temporadas y episodios; **extiende** de `Titulo` y sobrescribe el método `getDuracionEnMinutos()` para calcular la duración total de la serie.

**Atributos:**
- `temporadas`: Número de temporadas.
- `episodiosPorTemporadas`: Número de episodios por temporada.
- `minutosPorEpisodio`: Duración de cada episodio.

**Métodos:**
- `getDuracionEnMinutos()`: Calcula la duración total de la serie en función de las temporadas, episodios y duración por episodio.

### 4. `Episodio` (Implementa la interfaz `Clasificacion`)

La clase `Episodio` representa un episodio dentro de una serie; e **implementa** la interfaz `Clasificacion` para definir un comportamiento común de clasificación en distintos tipos de objetos.

**Atributos:**
- `numero`: Número del episodio.
- `nombre`: Nombre del episodio.
- `serie`: La serie a la que pertenece el episodio.
- `totalVisualizaciones`: Número total de visualizaciones.

**Métodos:**
- `getClasificacion()`: Retorna una clasificación basada en las visualizaciones del episodio.

### 5. `CalculadoraDeTiempo`

**Métodos:**
Esta clase se utiliza para acumular la duración de varios títulos (películas o series) en el proyecto.

- `incluye(Titulo titulo)`: Añade el tiempo de un título a la duración total.

### 6. `FiltroRecomendacion`
Esta clase filtra y muestra recomendaciones de títulos según la clasificación de éstos.

**Métodos:**
- `filtra(Clasificacion clasificacion)`: Filtra y recomienda un título según su clasificación.

### 7. `Clasificacion` (Interfaz)

Define un contrato para obtener clasificaciones de los objetos que la implementan, estos son, `Pelicula`, `Episodio` y cualquier otro tipo de objeto que pudiera ser clasificado.


## 📊 Diagramas UML
Aquí se presentan los diagramas UML que ilustran la estructura del proyecto y las relaciones entre las clases:


## 🛠️ Tecnologías Utilizadas
- **Java 17**
- **IntelliJ IDEA**
- **Paradigma de Programación Orientada a Objetos (POO)**

## 🚀 Instalación
1. **Clona el repositorio**
   ```bash
   git clone <https://github.com/Adelina-Tr/ONE-Java-Practica2-ScreenMatch>
