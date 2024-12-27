
import java.util.*;

/**
 * 
 * @author Alonso Genao | A00114295
 */

public class ModaDeValIngresados {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input para que el usuario ingrese los valores que desee
        System.out.println("\nA continuación, ingresa los valores separados por espacios.");
        String input =  scanner.nextLine();
        String[] values = input.split("\\s+");

        // Crea un mapa para almacenar la frecuencia de cada valor
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String value : values) {
            if (frequencyMap.containsKey(value)) {
                frequencyMap.put(value, frequencyMap.get(value) + 1);
            } else {
                frequencyMap.put(value, 1);
            }
        }

        // Encuentra la frecuencia máxima y los valores que la tienen
        int maxFrequency = 0;
        List<String> modes = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                modes.clear();
                modes.add(entry.getKey());
            } else if (frequency == maxFrequency) {
                modes.add(entry.getKey());
            }
        }

        // Output enseñandole la moda o las modas al usuario
        if (modes.size() == 1) {
            System.out.println("\nLa moda es: " + modes.get(0));
        } else {
            System.out.println("\nLas modas son: " + String.join(", ", modes) + "\n");
        }

        scanner.close();

    }

}