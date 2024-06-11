import java.util.Set;
import java.util.TreeSet;

public class EjercicioDos {
    public static void main(String[] args) {
        // SE crea un TreeSet para almacenar nombres
        Set<String> invitados = new TreeSet<String>();

        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        System.out.println("Lista de invitados: " + invitados);

        // Se crea un Set para posibles invitados
        Set<String> posiblesInvitados = new TreeSet<String>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        // Se une a los posibles invitados con los invitados
        invitados.addAll(posiblesInvitados);
        System.out.printf("Lista de invitados después de añadir posibles invitados: %s\n", invitados);

        // Se elimina a Jorge
        boolean esEliminado = invitados.remove("Jorge");
        if (esEliminado) {
            System.out.println("Jorge ha sido eliminado correctamente de la lista.");
        } else {
            System.out.println("Jorge no se encontraba en la lista.");
        }

        // Se imprime la lista final
        System.out.printf("Lista final de invitados: %s\n", invitados);
    }
}
