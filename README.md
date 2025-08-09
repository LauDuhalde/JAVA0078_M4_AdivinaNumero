# Juego Adivina el Número

Este es un pequeño proyecto en Java que implementa un juego para adivinar un número aleatorio entre 1 y 100.

---

## Descripción

El programa genera un número aleatorio entre 1 y 100 y le pide al usuario que intente adivinarlo.  
Después de cada intento, el programa indica si el número ingresado es mayor o menor que el número secreto, ayudando al usuario a acercarse a la respuesta correcta.  
Cuando el usuario adivina el número, el programa muestra cuántos intentos tomó y la lista completa de números ingresados.

---

## Archivos principales

- **Aplicacion.java**  
  Contiene el método `main` que controla el flujo del juego: generación del número aleatorio, lectura de los intentos del usuario y control del bucle de juego.

- **AdivinaNumero.java**  
  Clase con el método estático `compararNumeros` que compara el número ingresado con el número aleatorio y retorna si el juego debe continuar o terminar, además de mostrar mensajes de ayuda.

---

## Cómo ejecutar
1. Clona o descarga este repositorio.  
2. Abre una terminal y navega hasta la carpeta del proyecto.  
3. Compila las clases:  
   ```bash
   javac src/clases/AdivinaNumero.java src/clases/Aplicacion.java
4. Ejecutar el programa:
    ```bash
    java -cp src clases.Aplicacion
5. Seguir las instrucciones que aparecen en consola para ingresar números hasta adivinar el correcto.

---

## Dependencias
- Java JDK 8 o superior.
- No requiere librerías externas.

---

## Funcionalidad
- Genera un número aleatorio entre 1 y 100.
- Permite al usuario ingresar números desde la consola.
- Indica si el número ingresado es mayor o menor que el número secreto.
- Muestra la cantidad total de intentos cuando el usuario adivina.
- Muestra todos los intentos realizados.

---

## Autor
Laura Duhalde