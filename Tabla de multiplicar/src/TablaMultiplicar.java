import java.io.*;

// Cambiar el nombre de la clase o el del archivo para que coincidan
public class TablaMultiplicar {

  // Agregar el throws IOException
  public static void main (String[] args) throws IOException {

      InputStreamReader v_isr = new InputStreamReader(System.in); // Agregar las mayúsculas de InputStreamReader
      BufferedReader V_br = new BufferedReader(v_isr); 
      String v_cadena;
                
      int V_resultado = 0;
      int v_contador = 0;
             
      try {

        System.out.print("Introduzca el numero cuya tabla se desea calcular: "); // La s de System va mayúsculas
        v_cadena = V_br.readLine(); // La v de v_br.readLine va mayúscula
        int v_tabla = Integer.parseInt(v_cadena); // La i en parseInt va mayúscula
         
        System.out.print("La tabla del " + v_tabla + " es: ");
                   
        for (v_contador = 0; v_contador <= 12; v_contador++) {

            V_resultado = v_tabla * v_contador; // La v de v_resultado va mayúscula
            System.out.println(v_tabla + " x " + v_contador + " = " + V_resultado); // Falta el underscore a vtabla

          }                       
       }

       catch (Exception e) {
       
    }    
  }
} // Faltaba esta llave