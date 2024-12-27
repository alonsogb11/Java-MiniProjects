
import java.util.Scanner;

/**
 * 
 * @author Alonso Genao | A00114295
 */

public class SumaCuadradoDiagPrinc {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Inputs para el tamaño de la matriz
        System.out.print("\nIngresa el número de filas de la matriz: ");
        int nFilas =  scanner.nextInt();
        System.out.print("Ingresa el número de columnas de la matriz: ");
        int nColumnas = scanner.nextInt();

        if (nFilas == 0 || nColumnas == 0) {
            System.out.println("\nError, debe de haber un valor entero superior o igual a 1 en las columnas o filas de la matriz.\n");
            scanner.close();
            return; // Finaliza si el usuario ingresa 0 como valor de la variable nFilas o nColumnas.
        }

        if (nFilas != nColumnas) {
            System.out.println("\nError, la matriz ingresada no es cuadrada.\n");
            scanner.close();
            return; // Finaliza si la matriz no es cuadrada.
        }
        
        int [][] matriz = new int[nFilas][nColumnas];

        System.out.println("\nAhora los elementos de la matriz.\n");
        ingresarElementosMatriz(scanner, matriz);

        int sumaCuadradosDiagonal = sumaCuadradosDiagonal(matriz);
        System.out.println("\nLa suma de los cuadrados de los elementos de la diagonal es: " + sumaCuadradosDiagonal + "\n");

    }

    public static void ingresarElementosMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int sumaCuadradosDiagonal(int[][] matriz) {
        int suma = 0;
        
        // Verifica si la matriz es cuadrada
        if (matriz.length != matriz[0].length) {
            throw new IllegalArgumentException("La matriz no es cuadrada");
        }
        
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][i] * matriz[i][i]; // Suma el cuadrado del elemento diagonal
        }
        
        return suma;
    }

}