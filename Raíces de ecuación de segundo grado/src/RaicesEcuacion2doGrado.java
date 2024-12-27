
// Para poder obtener la respuesta del usuario desde la consola
import java.util.Scanner;

// Clase principal que contiene el método main
public class RaicesEcuacion2doGrado {

    //  Método main del programa, se ejecuta en consola cuando iniciamos nuestro programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Pedir al usuario los valores de a, b y c para calcular las raíces de la ecuación de segundo grado
        System.out.println("\nIngrese los valores de a, b y c para la ecuación de segundo grado ax^2 + bx + c = 0:\n");

        System.out.print("Valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Valor de c: ");
        double c = scanner.nextDouble();

        // Cálculo del discriminante para encontrar el número de raíces y el tipo
        double discriminante = b * b - 4 * a * c;

        // Condiciones que determinan el resultado a partir del discriminante, luego, se calcula el resultado final con la fórmula general

        // Si el discriminante es positivo entonces la ecuación tiene dos raíces reales y diferentes
        if (discriminante > 0) {

            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("\nLas raíces de la ecuación son reales y diferentes:\n");
            System.out.println("Raíz 1 = " + raiz1);
            System.out.println("Raíz 2 = " + raiz2 + "\n");

        // Si el discriminante es igual a cero, entonces la ecuación tiene dos raíces reales e iguales
        } else if (discriminante == 0) {

            double raiz = -b / (2 * a);
            System.out.println("\nLa ecuación tiene raíces reales e iguales:\n");
            System.out.println("Raíz = " + raiz + "\n");

        // De lo contrario, entonces la ecuación tiene dos raíces complejas
        } else {

            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("\nLas raíces de la ecuación son complejas:\n");
            System.out.println("Raíz 1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Raíz 2 = " + parteReal + " - " + parteImaginaria + "i\n");

        }

        // Para cerrar el scanner y que vean los resultados
        scanner.close();

    }
}