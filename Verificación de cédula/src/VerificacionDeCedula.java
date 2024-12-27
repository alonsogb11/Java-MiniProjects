
import java.util.*;

/**
 * 
 * @author Alonso Genao | A00114295
 */

public class VerificacionDeCedula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inputs para ingresar los valores de la cédula en su correspondiente orden
        System.out.print("\nIngresa el PRIMER digito de tu cédula: ");
        int primerDigito = sc.nextInt();
        System.out.print("Ingresa el SEGUNDO digito de tu cédula: ");
        int segundoDigito = sc.nextInt();
        System.out.print("Ingresa el TERCERO digito de tu cédula: ");
        int tercerDigito = sc.nextInt();
        System.out.print("Ingresa el CUARTO digito de tu cédula: ");
        int cuartoDigito = sc.nextInt();
        System.out.print("Ingresa el QUINTO digito de tu cédula: ");
        int quintoDigito = sc.nextInt();
        System.out.print("Ingresa el SEXTO digito de tu cédula: ");
        int sextoDigito = sc.nextInt();
        System.out.print("Ingresa el SEPTIMO digito de tu cédula: ");
        int septimoDigito = sc.nextInt();
        System.out.print("Ingresa el OCTAVO digito de tu cédula: ");
        int octavodigito = sc.nextInt();
        System.out.print("Ingresa el NOVENO digito de tu cédula: ");
        int novenoDigito = sc.nextInt();
        System.out.print("Ingresa el DÉCIMO digito de tu cédula: ");
        int decimoDigito = sc.nextInt();
        System.out.print("Ingresa el DÍGITO VERIFICADOR (ÚLTIMO DÍGITO) de tu cédula: ");
        int digitoVerificador = sc.nextInt();

        // Proceso de múltiplicación 1, 2
        int multPrimerDigito = primerDigito * 1; 
        int multTercerDigito = tercerDigito * 1; 
        int multQuintoDigito = quintoDigito * 1; 
        int multSeptimoDigito = septimoDigito * 1; 
        int multNovenoDigito = novenoDigito * 1;
        int multSegundoDigito = segundoDigito * 2; 
        int multCuartoDigito = cuartoDigito * 2; 
        int multSextoDigito = sextoDigito * 2; 
        int multOctavodigito = octavodigito * 2; 
        int multDecimoDigito = decimoDigito * 2; 

        // Por si los número multiplicando a 2 dan mayor a 9
        if (multSegundoDigito >= 10) {
            multSegundoDigito -= 9;
        }
        if (multCuartoDigito >= 10) {
            multCuartoDigito -= 9;
        }
        if (multSextoDigito >= 10) {
            multSextoDigito -= 9;
        }
        if (multOctavodigito >= 10) {
            multOctavodigito -= 9;
        }
        if (multDecimoDigito >= 10) {
            multDecimoDigito -= 9;
        }

        // Sumar el resultado de todos los productos
        int sumaDeProductos = multPrimerDigito + multSegundoDigito + multTercerDigito + multCuartoDigito + multQuintoDigito + multSextoDigito + multSeptimoDigito + multOctavodigito + multNovenoDigito + multDecimoDigito;

        // Obtener el resultado verificador
        int verificador = sumaDeProductos % 10;

        // Outputs y condicionantes que muestran o no la validez de la cédula si se cumplen esas condiciones
        if (verificador == digitoVerificador) {
            System.out.println("\nSu cédula (" + primerDigito + segundoDigito + tercerDigito + "-" + cuartoDigito + quintoDigito + sextoDigito + septimoDigito + octavodigito + novenoDigito + decimoDigito + "-" + digitoVerificador + ") es VÁLIDA");
        } else if (10 - verificador == digitoVerificador) {
            System.out.println("\nSu cédula (" + primerDigito + segundoDigito + tercerDigito + "-" + cuartoDigito + quintoDigito + sextoDigito + septimoDigito + octavodigito + novenoDigito + decimoDigito + "-" + digitoVerificador + ") es VÁLIDA");
        } else {
            System.out.println("\nSu cédula (" + primerDigito + segundoDigito + tercerDigito + "-" + cuartoDigito + quintoDigito + sextoDigito + septimoDigito + octavodigito + novenoDigito + decimoDigito + "-" + digitoVerificador + ") NO ES VÁLIDA");
        }

        sc.close();

    }

}