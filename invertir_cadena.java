package Algoritmo;

public class invertir_cadena {
	
    static String invertir(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        }
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }

    public static void main(String[] args) {
        String cadena = "Hola, Mundo";
        String cadenaInvertida = invertir(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}
