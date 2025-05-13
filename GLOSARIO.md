# 📖 Glosario de ScreenMatch

## 🔹 Pilares de la Programación Orientada a Objetos (POO)
Estos principios fundamentales estructuran el diseño de software en POO:

- **Abstracción**: Permite definir estructuras generales y ocultar detalles innecesarios para simplificar el uso de un objeto.
    - **Ejemplo en ScreenMatch**: La clase `Titulo` define atributos comunes para `Pelicula` y `Serie`, evitando repetición de código.

- **Encapsulamiento**: Protege el acceso a los atributos mediante **modificadores de acceso** (`private`), permitiendo la manipulación de datos de forma controlada a través de **getters y setters**.
    - **Ejemplo en ScreenMatch**: Los atributos `nombre` y `duracionEnMinutos` de `Titulo` son **privados** y accesibles solo con sus métodos `getNombre()` y `setDuracionEnMinutos()`.

- **Herencia**: Permite que una clase **herede** atributos y métodos de otra, evitando código duplicado y promoviendo la reutilización.
    - **Ejemplo en ScreenMatch**: `Pelicula` y `Serie` **extienden** (`extends`) `Titulo`, heredando su comportamiento.

- **Polimorfismo**: Permite que una clase sobrescriba métodos (`@Override`) o implemente interfaces para definir un comportamiento común pero adaptable.
    - **Ejemplo en ScreenMatch**: `Pelicula` y `Episodio` **implementan** (`implements`) `Clasificacion`, permitiendo que cada una defina su propia lógica para `getClasificacion()`.

---

## 🔑 Palabras Clave en POO
Estos conceptos son esenciales en la estructura de cualquier sistema basado en POO:

- **Clase**: Plantilla que define atributos y métodos. Ejemplo: `Titulo`, `Pelicula`, `Serie`.
- **Objeto**: Instancia de una clase con valores asignados. Ejemplo: `miPelicula = new Pelicula();`.
- **Atributo**: Propiedades de una clase que representan características del objeto. Ejemplo: `nombre: String`, `duracionEnMinutos: int`.
- **Método**: Función dentro de una clase que define el comportamiento de los objetos. Ejemplo: `calculaMedia()`, `muestraFichaTecnica()`.
- **Superclase**: Clase base que es heredada por otras. Ejemplo: `Titulo` es la **superclase** de `Pelicula` y `Serie`.
- **Subclase**: Clase que hereda de otra. Ejemplo: `Pelicula` es una **subclase** de `Titulo`.
- **Instancia**: Creación de un objeto basado en una clase. Ejemplo: `Serie casaDragon = new Serie();`.
- **Sobreescritura (`@Override`)**: Modificación de un método heredado. Ejemplo: `Serie` sobrescribe `getDuracionEnMinutos()`.
- **Interface**: Define un contrato para las clases que la implementan. Ejemplo: `Clasificacion` es implementada por `Pelicula` y `Episodio`.
- **Paquete (`package`)**: Organización de clases en módulos. Ejemplo: `com.aluracursos.screenmatch.modelos`.
- **Modificadores de acceso**: Determinan la visibilidad de atributos y métodos. Ejemplo: `private`, `protected`, `public`.
- **Getters y Setters**: Métodos para acceder y modificar atributos encapsulados. Ejemplo: `getNombre()`, `setDuracionEnMinutos()`.
- **Uso de `this` y `super`**:
    - `this`: Hace referencia al objeto actual dentro de la clase. Ejemplo: `this.nombre = nombre;`.
    - `super`: Permite acceder a atributos/métodos de la **superclase**. Ejemplo: `super.getDuracionEnMinutos();`.

---

## 🚀 Palabras Reservadas en Java
Estas palabras tienen un significado especial en el lenguaje y no pueden usarse como identificadores:

- `class`: Define una clase. Ejemplo: `public class Pelicula { ... }`.
- `interface`: Define una interfaz. Ejemplo: `public interface Clasificacion { ... }`.
- `extends`: Define **herencia** de una superclase. Ejemplo: `public class Pelicula extends Titulo`.
- `implements`: Indica que una clase **implementa** una interfaz. Ejemplo: `public class Episodio implements Clasificacion`.
- `private`: Restringe acceso a atributos/métodos dentro de la misma clase. Ejemplo: `private String nombre;`.
- `protected`: Permite acceso desde la misma clase y sus subclases.
- `public`: Permite acceso desde cualquier parte del programa.
- `void`: Indica que un método **no** devuelve un valor. Ejemplo: `public void muestraFichaTecnica()`.
- `return`: Devuelve un valor desde un método. Ejemplo: `return sumaDeEvaluaciones / totalDeEvaluaciones;`.
- `new`: Crea una nueva instancia de una clase. Ejemplo: `new Pelicula();`.
- `static`: Permite acceso sin necesidad de instanciar un objeto.
- `final`: Previene modificación o herencia.
- `super`: Hace referencia a la **superclase**. Ejemplo: `super.getDuracionEnMinutos();`.
- `this`: Hace referencia al objeto actual. Ejemplo: `this.nombre = nombre;`.
- `import`: Permite importar clases de otros paquetes. Ejemplo: `import com.aluracursos.screenmatch.modelos.Pelicula;`.
- `package`: Define el paquete al que pertenece una clase. Ejemplo: `package com.aluracursos.screenmatch.modelos;`.

---
