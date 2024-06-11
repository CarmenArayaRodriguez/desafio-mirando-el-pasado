import java.util.Queue;
import java.util.LinkedList;

public class EjercicioCuatro {
    public static void main(String[] args) {
        // Se crea un Queue con LinkedList para almacenar juegos
        Queue<String> juegos = new LinkedList<String>();

        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        // Contar y mostrar
        System.out.printf("Total de juegos en la lista: %d\n", juegos.size());
        System.out.printf("Juegos listados: %s\n", juegos);
    }
}
