import java.util.Map;
import java.util.TreeMap;

public class EjercicioTres {
    public static void main(String[] args) {
        // Se crea un TreeMap para almacenar golosinas y sus precios
        Map<String, Integer> golosinas = new TreeMap<>();

        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);

        // Filtrar y mostrar
        System.out.println("Golosinas con precio menor a 100 pesos:");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
                System.out.println(entry.getKey() + " - $" + entry.getValue());
            }
        }
    }
}
