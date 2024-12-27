import java.util.Scanner;

public class ImpuestoRenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sueldoAnual = 0.0;
        boolean inputValido = false;
        
        // Solicitar ingreso del sueldo hasta que se ingrese un número válido
        while (!inputValido) {
            System.out.print("\nIngrese su sueldo anual: ");
            if (scanner.hasNextDouble()) {
                sueldoAnual = scanner.nextDouble();
                inputValido = true;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar el valor incorrecto del scanner
            }
        }
        
        double impuesto = calcularImpuesto(sueldoAnual);
        System.out.printf("El impuesto sobre la renta es: RD$ %.2f%n", impuesto);

        scanner.close();
    }
    
    public static double calcularImpuesto(double sueldo) {
        double impuesto = 0.0;
        
        if (sueldo <= 416220.00) {
            impuesto = 0.0; // Exento
        } else if (sueldo <= 624329.00) {
            impuesto = (sueldo - 416220.01) * 0.15; // 15% del excedente
        } else if (sueldo <= 867123.00) {
            impuesto = 31216.00 + (sueldo - 624329.01) * 0.20; // 31k + 20% del excedente
        } else {
            impuesto = 79776.00 + (sueldo - 867123.01) * 0.25; // 79k + 25% del excedente
        }
        
        return impuesto;
    }
}