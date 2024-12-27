import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

/**
 * 
 * @author Alonso Genao | A00114295
 */

public class GuardarMatrizOrdenada {

    /* Función principal del programa */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        /* Para solicitar el orden la matriz, o sea, si es 3x3, 2x2 o así */
        System.out.println("Ingrese el orden de la matriz (filas y columnas):");
        int orden = scanner.nextInt();

        /* Para crear la matriz */
        int[][] matriz = new int[orden][orden];

        /* Para leer los datos de la matriz en el orden que quiera el usuario */
        System.out.println("Ingrese los datos de la matriz:");
        for (int i = 0; i < orden; i++) {
            for (int j = 0; j < orden; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        ordenarMatriz(matriz);

        /* Para escribir la matriz en el archivo */
        File archivo = new File("matriz_ordenada.csv");
        PrintWriter escritor = new PrintWriter(archivo);

        for (int i = 0; i < orden; i++) {
            for (int j = 0; j < orden; j++) {
                escritor.print(matriz[i][j]);
                if (j < orden - 1) {
                    escritor.print(",");
                }
            }
            escritor.println();
        }

        escritor.close();

        System.out.println("La matriz ordenada se ha guardado en el archivo " + archivo.getAbsolutePath());

        scanner.close();
    }

    /* Módulo para ordenar la matriz */
    private static void ordenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i].length; k++) {
                    if (matriz[i][j] > matriz[i][k]) {
                        int temp = matriz[i][j];
                        matriz[i][j] = matriz[i][k];
                        matriz[i][k] = temp;
                    }
                }
            }
        }
    }
}