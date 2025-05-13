# ✅ Buenas Prácticas de Programación en Java en el Contexto de POO

Este documento reúne las **buenas prácticas de programación orientada a objetos (POO) en Java** que fueron implementadas en el proyecto **ScreenMatch**, siguiendo estándares de calidad y mantenimiento de código.

## 📌 Principios de Diseño Aplicados

### 1️⃣ **Uso Correcto de la Abstracción**
✔ Se creó la clase `Titulo` con atributos y métodos generales para representar películas y series sin repetir código innecesario.  
✔ Se agruparon atributos esenciales (`nombre`, `fechaDeLanzamiento`, `duracionEnMinutos`) para garantizar una estructura base reutilizable.

### 2️⃣ **Encapsulamiento para Protección de Datos**
✔ Se usaron **modificadores de acceso** (`private`) en todos los atributos, asegurando que solo se accedan mediante **getters y setters**.  
✔ Se evitó la manipulación directa de datos, protegiendo la integridad de los objetos.

### 3️⃣ **Herencia para Reutilización de Código**
✔ Las clases `Pelicula` y `Serie` **extienden** (`extends`) `Titulo`, lo que evita duplicar atributos comunes.  
✔ Se aprovechó **la superclase `Titulo`** para manejar las características compartidas por películas y series.

### 4️⃣ **Polimorfismo con Interfaces y Sobreescritura**
✔ La interfaz `Clasificacion` define un **contrato** que es implementado por `Pelicula` y `Episodio`, garantizando una estructura flexible y reutilizable.  
✔ Se utilizó **sobreescritura de métodos (`@Override`)** en `Serie` para personalizar `getDuracionEnMinutos()`, adaptándolo a la lógica específica de series.

---

## 🏗️ Organización del Código

### 5️⃣ **Uso de Paquetes para Modularidad**
✔ Se organizaron clases en paquetes según su propósito:
- `com.aluracursos.screenmatch.modelos`: Contiene clases de dominio (`Titulo`, `Pelicula`, `Serie`, `Episodio`).
- `com.aluracursos.screenmatch.calculos`: Contiene herramientas de procesamiento (`CalculadoraDeTiempo`, `FiltroRecomendacion`).

### 6️⃣ **Aplicación Correcta de Modificadores de Acceso**
✔ Se usaron `private` para atributos internos.  
✔ Se usaron `public` para métodos esenciales.  
✔ Se evitó el uso innecesario de `protected`, asegurando encapsulamiento adecuado.

### 7️⃣ **Nomenclatura Clara y Legible**
✔ Se siguieron **nombres descriptivos** para clases y métodos (`calculaMedia()`, `getClasificacion()`).  
✔ Se utilizó **convención camelCase** (`nombreDeTitulo`, `duracionEnMinutos`).  
✔ Se respetó **convención PascalCase** para nombres de clases (`Pelicula`, `Serie`).

---

## ⚡ Código Eficiente y Reutilizable

### 8️⃣ **Uso de Getters y Setters para Manipulación Controlada**
✔ Se crearon **métodos de acceso (`get`) y modificación (`set`)** para atributos encapsulados.  
✔ Se evitó **acceso directo a los atributos**, asegurando que los valores sean validados antes de ser modificados.

### 9️⃣ **Evitar Código Duplicado con Métodos Genéricos**
✔ Se implementó `evalua(double nota)` en `Titulo`, evitando que `Pelicula` y `Serie` dupliquen lógica de evaluación.  
✔ Se generalizaron métodos como `calculaMedia()`, asegurando reutilización eficiente.

### 🔟 **Uso Correcto de Clases y Relaciones**
✔ Se implementó la relación `Episodio --> Serie` para reflejar la composición lógica entre episodios y series.  
✔ Se aplicó **polimorfismo** en `FiltroRecomendacion`, aceptando cualquier objeto que implemente `Clasificacion`.

---

## 📚 Conclusión

El proyecto **ScreenMatch** sigue una estructura bien organizada con principios sólidos de **POO en Java**, garantizando código mantenible, reutilizable y claro. Estas buenas prácticas facilitan la expansión del proyecto y mejoran su calidad a largo plazo.

🚀 **Si deseas contribuir o mejorar estas prácticas, revisa el código y propón mejoras en el repositorio!**  
