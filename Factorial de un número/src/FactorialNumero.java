import java.io.*;

// Error 1: cambiar el nombre el archivo para que coincida con el de la clase
public class FactorialNumero {

   // Capitalizar la s de string, agregar los corchetes
   public static void main (String[] args) {

      InputStreamReader v_isr = new InputStreamReader(System.in);
      BufferedReader v_br = new BufferedReader(v_isr);
      String V_cadena;
                
      int v_factorial = 1;
      int v_contador = 0;
      int v_numero = 0;

      try {
      
         System.out.print("Introduzca el numero a calcularle el factorial: ");
         V_cadena = v_br.readLine(); // Capitalizar la V de v_cadena y la L de v_br.readline
         v_numero = Integer.parseInt(V_cadena); // Capitalizar la V de v_cadena y eliminar el int, porque arriba ya se declaró la variable
         
         // Capitalizar las V de v_contador, cambiar las comas por puntos y comas y agregarle la underscore a vnumero
         for (v_contador = 1; v_contador <= v_numero; v_contador++); 
         v_factorial = v_factorial * v_contador; // Capitalizar la V de v_contador

         // Reemplazar las comillas simples por comillas dobles y poner la v de V_numero en minúscula
         System.out.println("El factorial del numero " + v_numero + " es: " + v_factorial); 
       
         }

       catch (Exception e) {

      }
   }
} // Agregar este corchete