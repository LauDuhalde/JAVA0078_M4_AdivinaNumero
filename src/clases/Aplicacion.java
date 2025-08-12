package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// Genera un número entre 1 y 100
		int aleatorio = (int)(Math.random() * 100) + 1;
		
		// Variable para controlar si debe seguir intentando
		boolean reintentar = true;
		
		// Lista para guardar todos los intentos realizados
		ArrayList<Integer> intentos = new ArrayList<>();
		
		// String linea = System.console().readLine(); arrojaba error, así que se cambia por Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor ingresa un número entre 1 - 100 para adivinar.\n");
		do {
			// Lee el número que el usuario ingresa
			int num = sc.nextInt();
			
			if(num > 0 && num <101) { //Solo se consideran los intentos con números válidos entre 1 y 100
			
				// Guarda el intento en la lista
				intentos.add(num);
			
				// Llama al método compararNumeros para verificar si el intento es correcto
				// Si devuelve false, significa que el usuario adivinó
				reintentar = AdivinaNumero.compararNumeros(num, aleatorio);
				if(!reintentar) {
					// Muestra cuántos intentos tomó adivinarlo
					System.out.println("Te tomó "+intentos.size()+" veces adivinar el número");
				
					// Construye un mensaje con todos los intentos realizados
					String mensaje="";
					for (Integer intento : intentos) {
						mensaje += intento + " ";
					}
					System.out.println(mensaje);
				}
			}else {
				System.out.println("Intento inválido.\nPor favor, ingresa un número entre 1 y 100");
			}
			
		} while(reintentar); // Repite mientras no se adivine el número
		
		sc.close();
	}

}

