import java.util.Scanner;

/**
 * 
 * @author Alonso Genao | A00114295
 */

public class MinimoComunMultiplo {

    // Función para encontrar el máximo común divisor de los números
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    // Función para encontrar el mínimo común múltiplo de los números
    public static int mcm(int a, int b) {
        return (a * b) / mcd(a, b);
    }

    // Método main :D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de números a los que se les quiere calcularle el MCM
        System.out.print("Ingrese la cantidad de números que desee: ");
        int count = sc.nextInt();

        int[] numbers = new int[count];

        // Solicitar al usuario que ingrese los números que quiera y guardarlos en un array
        System.out.println("Ahora ingrese los números:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        // Para calcular el MCM de los números
        int result = numbers[0];
        for (int i = 1; i < count; i++) {
            result = mcm(result, numbers[i]);
        }

        // Enseñar por consola el resultado 
        System.out.println("El mínimo común múltiplo es: " + result);

        sc.close();
    }
}