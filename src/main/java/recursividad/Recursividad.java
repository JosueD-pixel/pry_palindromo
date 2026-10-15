/*
 * Alumno: Angel Josue Domingo Guillen
 * Grupo: 4 C
 * Matricula: 20251011
 *
 * Practica: Verificar si una palabra o frase es palindromo
 * usando recursividad y el patron wrapper (metodo envoltorio).
 */
package recursividad;

import java.util.Scanner;

/**
 * Un palindromo se lee igual de izquierda a derecha que de derecha a izquierda.
 * Ejemplos: "radar", "reconocer", "Anita lava la tina".
 *
 * @author Angel Josue Domingo Guillen
 */
public class Recursividad {

    /**
     * Metodo WRAPPER (envoltorio).
     * Es el metodo publico que usa el usuario: solo recibe el texto.
     * Prepara los datos y hace la primera llamada al metodo recursivo,
     * asi quien lo usa no tiene que preocuparse por los indices.
     */
    public static boolean esPalindromo(String texto) {
        // Se pasa a minusculas y se quitan los espacios para que
        // "Anita lava la tina" se compare como "anitalavalatina"
        String textoLimpio = texto.toLowerCase().replace(" ", "");

        // i empieza en la primera letra (0) y j en la ultima (length - 1)
        return esPalindromoAux(textoLimpio, 0, textoLimpio.length() - 1);
    }

    /**
     * Metodo AUXILIAR RECURSIVO.
     * Es privado porque necesita los indices i y j, que son un detalle interno.
     * Compara la letra de la izquierda (i) con la de la derecha (j)
     * y se llama a si mismo acercando los indices hacia el centro.
     */
    private static boolean esPalindromoAux(String texto, int i, int j) {
        // Caso base 1 (exito): los indices se encontraron (i == j)
        // o se cruzaron (i > j), ya se revisaron todas las letras
        if (i >= j) {
            return true;
        }

        // Caso base 2 (fallo): las letras de los extremos son distintas
        if (texto.charAt(i) != texto.charAt(j)) {
            return false;
        }

        // Paso recursivo: las letras son iguales, se revisa la parte de en medio
        // avanzando i una posicion y retrocediendo j una posicion
        return esPalindromoAux(texto, i + 1, j - 1);
    }

    /**
     * Metodo principal: pide la palabra o frase al usuario
     * y muestra si es palindromo usando el metodo wrapper.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Angel Josue Domingo Guillen | 4 C | 20251011");
        System.out.print("Ingresa una palabra o frase: ");

        // nextLine() lee la linea completa, incluyendo espacios
        String palabra = entrada.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println(palabra + " SI es palindromo");
        } else {
            System.out.println(palabra + " NO es palindromo");
        }

        entrada.close();
    }
}
