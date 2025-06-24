# Proyectos de Ejemplos Java: EjercicioSnaks y TemasAvanzados

Este repositorio contiene una colección de proyectos y ejemplos de código en Java, diseñados para ilustrar diversos conceptos de programación.

## Estructura del Repositorio

El repositorio está organizado en dos proyectos Java principales e independientes:

*   `EjercicioSnaks/`: Un proyecto que simula una máquina expendedora de snacks, utilizando estructuras de datos y manejo de archivos.
*   `TemasAvanzados/`: Un proyecto que contiene diversos ejemplos y ejercicios sobre temas más avanzados de Java, como excepciones, colecciones, programación funcional básica, pequeños retos de lógica, etc.

## Requisitos

Para trabajar con los proyectos en este repositorio, necesitarás:

*   JDK (Java Development Kit) versión 11 o superior.
*   Un IDE (Entorno de Desarrollo Integrado) compatible con Java, como:
    *   IntelliJ IDEA (Community o Ultimate)
    *   Eclipse IDE for Java Developers

## Cómo Empezar

### 1. Clonar el Repositorio

Para obtener una copia local de los proyectos, clona este repositorio usando Git:

```bash
git clone https://github.com/Mfarro1522/TemasAvanzadosJava.git
cd TemasAvanzadosJava
```

### 2. Importar los Proyectos en tu IDE

Puedes importar `EjercicioSnaks` y `TemasAvanzados` como proyectos separados en tu IDE.

**IntelliJ IDEA:**

*   **Desde la pantalla de bienvenida de IntelliJ IDEA:**
    1.  Selecciona "Open".
    2.  Navega hasta el directorio donde clonaste el repositorio.
    3.  Selecciona la carpeta `EjercicioSnaks` y haz clic en "OK". IntelliJ debería reconocerlo como un proyecto Java existente (basado en el archivo `.iml`).
    4.  Repite el proceso para la carpeta `TemasAvanzados`.
*   **Si ya tienes un proyecto abierto:**
    1.  Ve a `File > Open...`.
    2.  Navega y selecciona la carpeta `EjercicioSnaks` o `TemasAvanzados`.

*Nota sobre la estructura de `EjercicioSnaks`*: Este proyecto sigue una estructura estándar con código fuente en `EjercicioSnaks/src/main/java` y recursos en `EjercicioSnaks/src/main/resources`.

*Nota sobre la estructura de `TemasAvanzados`*: Actualmente, este proyecto tiene su código fuente directamente bajo `TemasAvanzados/src/`. (Nota: Se planea refactorizar a la estructura `src/main/java` en el futuro).

**Eclipse IDE:**

1.  Ve a `File > Import...`.
2.  En el diálogo de importación, expande la carpeta `General` y selecciona `Existing Projects into Workspace`. Haz clic en "Next".
3.  En "Select root directory", navega y selecciona la carpeta `EjercicioSnaks`. Eclipse debería detectar el proyecto. Asegúrate de que esté marcado en la lista "Projects".
4.  Haz clic en "Finish".
5.  Repite los pasos 2-4 para el directorio `TemasAvanzados`.

### 3. Compilar y Ejecutar los Proyectos

Una vez importados, puedes compilar y ejecutar los proyectos directamente desde tu IDE:

*   **IntelliJ IDEA:**
    *   Busca las clases con métodos `main` (por ejemplo, `MaquinaSnacks.java` en ambos proyectos, o varias clases dentro de `TemasAvanzados/src/`).
    *   Haz clic derecho en el archivo o dentro del editor en el método `main` y selecciona "Run 'NombreClase.main()'".
*   **Eclipse:**
    *   Busca las clases con métodos `main`.
    *   Haz clic derecho en el archivo `.java` en el "Package Explorer" y selecciona `Run As > Java Application`.

## Limpieza del Proyecto

Se ha añadido un archivo `.gitignore` global para excluir archivos de compilación (`*.class`, directorios `out/`, `build/`) y archivos específicos de IDE innecesarios del control de versiones.

---

Si encuentras algún problema o tienes sugerencias, por favor abre un "Issue" en el repositorio.
