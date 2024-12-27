
import java.util.*;

/**
 * 
 * @author Alonso Genao | A00114295
 */

 public class MetodoRecursivoDeChar {

    /* El método recursivo para eliminar de la cadena el caracter repetido */
    public static String quitarCaractRep(String str, char caracterRep) {

        /* Si no se ingresa nada o si la cadena tiene un solo caracter */
        if (str == null || str.length() <= 1) {
            return str;
        }

        /* Si el primer carácter es igual al carácter repetido, lo eliminamos */
        if (str.charAt(0) == caracterRep) {
            return quitarCaractRep(str.substring(1), caracterRep);
        }

        /* Recursivamente llamamos a la función con la subcadena restante */
        return str.charAt(0) + quitarCaractRep(str.substring(1), caracterRep);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* input para que el usuario introduzca la cadena y el carácter repetido */
        System.out.print("Introduce la cadena con caracteres repetidos: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduce el caracter repetido: ");
        char caractRepetido = scanner.next().charAt(0);

        /* Llamamos al método recursivo para eliminar el carácter repetido */
        String resultado = quitarCaractRep(cadena, caractRepetido);

        /* Mostramos el resultado */
        System.out.println("Cadena sin el caracter repetido: " + resultado);

        scanner.close();

    }
}