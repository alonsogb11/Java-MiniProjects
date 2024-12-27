
import java.util.Scanner;

/**
 * 
 * @author Alonso Genao | A00114295
 */

public class MultiplicacionMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de la primera matriz
        System.out.print("\nIngrese el número de filas de la primera matriz: ");
        int filasA = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz: ");
        int columnasA = scanner.nextInt();

        // Solicitar al usuario el tamaño de la segunda matriz
        System.out.print("\nIngrese el número de filas de la segunda matriz: ");
        int filasB = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        int columnasB = scanner.nextInt();

        // Verificar si es posible multiplicar las matrices
        if (columnasA != filasB) {
            System.out.println("\nNo es posible multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            scanner.close();
            return;
        }

        // Crear los matrices
        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[filasB][columnasB];

        // Ingresar elementos de la primera matriz
        System.out.println("\nIngrese los elementos de la primera matriz: ");
        ingresarElementosMatriz(scanner, matrizA);

        // Ingresar elementos de la segunda matriz
        System.out.println("\nIngrese los elementos de la segunda matriz: ");
        ingresarElementosMatriz(scanner, matrizB);

        // Realizar la multiplicación de matrices
        int[][] resultado = multiplicarMatrices(matrizA, matrizB);

        // Mostrar el resultado entre corchetes
        System.out.println("\nEl resultado de la multiplicación es:");
        mostrarMatriz(resultado);

        scanner.close();
    }

    // Método para ingresar los elementos de una matriz
    public static void ingresarElementosMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para multiplicar dos matrices
    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasB = matrizB[0].length;
        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    // Método para mostrar una matriz entre corchetes
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println( );
    }
    
}