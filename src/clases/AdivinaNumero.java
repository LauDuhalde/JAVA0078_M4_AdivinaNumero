package clases;

public class AdivinaNumero {
	public static boolean compararNumeros(int ingresado, int aleatorio) {
		boolean reintentar = true; // Variable de retorno que indica si se debe seguir intentando
		
		//Imprime mensaje según comparación
		if (ingresado == aleatorio) {
			System.out.println("¡Has conseguido adivinar el número!");
			reintentar = false; // Ya no es necesario seguir intentando
		}else if(ingresado>aleatorio){
			System.out.println("Intenta con un número más pequeño.");
		}else {
			System.out.println("Intenta con un número más grande.");
		}
		
		return reintentar;
	}
}
