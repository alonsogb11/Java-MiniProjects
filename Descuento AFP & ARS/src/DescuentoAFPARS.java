// Import para poder utilizar el scanner
import java.util.Scanner;

// Clase principal
public class DescuentoAFPARS {

    // Método main de la clase principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el salario
        System.out.println("Ingrese el salario del ciudadano:");
        double salario = scanner.nextDouble();

        // Aplicar las condiciones para el salario
        salario = Math.max(7000, Math.min(salario, 100000));

        // Calcular el descuento de AFP y ARS
        double descuentoAFP = salario * 0.0287; // 2.87% de descuento de AFP
        double descuentoARS = salario * 0.0304; // 3.04% de descuento de ARS

        // Mostrar los descuentos
        System.out.println("Descuento de AFP: " + descuentoAFP);
        System.out.println("Descuento de ARS: " + descuentoARS);

        scanner.close();
    }
}