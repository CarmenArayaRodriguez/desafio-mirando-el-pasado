import java.util.ArrayList;

public class EjercicioUno {
    public static void main(String[] args) {
        // Se crea una lista para almacenar las marcas
        ArrayList<String> marcas = new ArrayList<String>();

        // SE agregan 10 marcas
        marcas.add("Cuadernos Austral");
        marcas.add("Pluma");
        marcas.add("Icarito");
        marcas.add("Free");
        marcas.add("Supermercados Monserrat");
        marcas.add("Almac");
        marcas.add("Atari");
        marcas.add("Kapo");
        marcas.add("Jovi Rhein");
        marcas.add("Jesmar");

        // SE imprimen las marcas iniciales
        System.out.printf("Marcas iniciales: %s\n", marcas);

        // Se agregan las marcas que recordó la amiga
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        // Se imprime el listado con las nuevas marcas
        System.out.printf("Nuevo listado de marcas: %s\n", marcas);

        // se corrige el nombre de "Blokbaster" a "Blockbuster"
        marcas.replaceAll(marca -> marca.equals("Blokbaster") ? "Blockbuster" : marca);
        if (marcas.contains("Blockbuster") && !marcas.contains("Blokbaster")) {
            System.out.println("El nombre 'Blokbaster' ha sido corregido a 'Blockbuster' correctamente.");
            // Se imprime la lista después de la corrección
            System.out.printf("Listado después de corregir 'Blokbaster': %s\n", marcas);
        }  else {
            System.out.println("El cambio no se realizó como se esperaba.");
        }

        // SE elimina la marca Carrefour
        boolean esEliminado = marcas.remove("Carrefour");
        if (esEliminado) {
            System.out.println("Carrefour fue eliminado correctamente.");
        } else {
            System.out.println("Carrefour no se encontró en la lista.");
        }

        System.out.printf("Listado después de eliminar Carrefour: %s\n", marcas);

        // Se crea una lista adicional de posibles marcas desaparecidas
        ArrayList<String> posiblesMarcas = new ArrayList<String>();
        posiblesMarcas.add("Frazadas El Castillo");
        posiblesMarcas.add("Helados Chamonix");

        // SE agregan todas las posibles marcas a la lista principal
        marcas.addAll(posiblesMarcas);
        System.out.printf("Listado final después de agregar posibles marcas desaparecidas: %s\n", marcas);

        // Se cuenta e imprimir el número de elementos en la lista
        System.out.printf("Total de marcas en la lista: %s", marcas.size());
    }
}
