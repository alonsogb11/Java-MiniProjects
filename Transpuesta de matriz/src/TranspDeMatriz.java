
import java.util.Scanner;

/**
 * 
 * @author Alonso Genao | A00114295
 */

public class TranspDeMatriz {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        // Para determinar el tamaño de la matriz
        System.out.print("\nIngresa el número de filas de la matriz: ");
        int nFilas = scanner.nextInt();
        System.out.print("Ingresa el número de columnas de la matriz: ");
        int nColumnas = scanner.nextInt();

        int [][] matrix = new int [nFilas][nColumnas];

        System.out.println("\nAhora los elementos de la matriz.\n");
        ingresarElementosMatriz(scanner, matrix);

        int[][] matrizTranspuesta = obtenerTranspuesta(matrix);
        
        System.out.print("\n");
        // Imprimir la matriz transpuesta
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[0].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\n");

    }

    public static void ingresarElementosMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] obtenerTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        // Crear una nueva matriz para almacenar la transpuesta
        int[][] transpuesta = new int[columnas][filas];
        
        // Calcular la transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        return transpuesta;
    }

}