
import java.util.*;

/**
 * 
 * @author Alonso Genao | A00114295
 */

public class DetCantDeTiempoEntreFechas {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /* Inputs para las fechas, en este caso es el input de la fecha más cercana a la actualidad */
        System.out.print("\nIngresa el DÍA de la fecha final (xx): ");
        int diaFinal = scanner.nextInt();
        System.out.print("Ingresa el MES de la fecha final (xx): ");
        int mesFinal = scanner.nextInt();
        System.out.print("Ingresa el AÑO de la fecha final (xxxx): ");
        int annoFinal = scanner.nextInt();

        /* Y este es el input para la fecha más alejada a la actualidad */
        System.out.print("\nIngresa el DÍA de la fecha inicial (xx): ");
        int diaInicial = scanner.nextInt();
        System.out.print("Ingresa el MES de la fecha inicial (xx): ");
        int mesInicial = scanner.nextInt();
        System.out.print("Ingresa el AÑO de la fecha inicial (xxxx): ");
        int annoInicial = scanner.nextInt();

        /* Una serie de controles condicionales por si se cumplen o no ciertas situaciones, 
        como la siguiente, que se encarga de verificar si el MES y el DÍA de la fecha más
        actual son menores a los de la fecha más alejada */
        if (mesFinal < mesInicial && diaFinal < diaInicial) {

            annoFinal--;
            mesFinal += 11;
            diaFinal -= 1;

            /* Un control anidado para verificar si el mes de la fecha más actual tiene 31, 
            30 o 28 días respectivamente, y que se pueda efectuar la operación correctamente */
            if ( mesFinal == 1 || mesFinal == 3 || mesFinal == 5 || mesFinal == 7 || mesFinal == 8 || mesFinal == 10 || mesFinal == 12) {
                
                int diasPrestados31 = 31;

                diaFinal = diaFinal + diasPrestados31;

            } else if (mesFinal == 2) {

                int diasPrestados28 = 28;

                diaFinal = diaFinal + diasPrestados28;

            } else {

            diaFinal = diaFinal + 30;

            }

        /* Otro control condicionante, en este caso para verificar si el MES de la fecha 
        más reciente es mayor al de la fecha más alejada y si el DÍA final es menor al 
        del inicial */
        } else if (mesFinal > mesInicial && diaFinal < diaInicial) {

            mesFinal--;
            diaFinal += 1;

            if ( mesFinal == 1 || mesFinal == 3 || mesFinal == 5 || mesFinal == 7 || mesFinal == 8 || mesFinal == 10 || mesFinal == 12) {
                
                int diasPrestados31 = 31;

                diaFinal = diaFinal + diasPrestados31;

            } else if (mesFinal == 2) {

                int diasPrestados28 = 28;

                diaFinal = diaFinal + diasPrestados28;

            } else {

            diaFinal = diaFinal + 30;

            }
            
        /* Último control para verificar si se cumple el caso contrario al anterior else if */
        } else if (mesFinal < mesInicial && diaFinal > diaInicial) {

            annoFinal--;
            mesFinal += 12;

        } 

        /* Por último, solo queda efectuar las operaciones respectivas e imprimirlo por consola :D */
        int diaResultante = diaFinal - diaInicial;
        int mesResultante = mesFinal - mesInicial;
        int annoResultante = annoFinal - annoInicial;

        System.out.println("\nHan pasado aproximadamente " + diaResultante + " día(s), " + mesResultante + " mes(s) y " + annoResultante + " año(s).\n");

        scanner.close();

    }

}