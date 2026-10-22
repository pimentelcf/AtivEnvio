package ex14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();
        agenda.put("Ana", "99999-1111");
        agenda.put("Bruno", "98888-2222");
        agenda.put("Carla", "97777-3333");
        agenda.put("Diego", "96666-4444");
        System.out.println("Agenda: " + agenda);

        // Buscar
        System.out.println("Telefone da Carla: " + agenda.get("Carla"));

        // Atualizar
        agenda.put("Carla", "91111-0000");
        System.out.println("Novo telefone da Carla: " + agenda.get("Carla"));

        // Remover
        agenda.remove("Bruno");
        System.out.println("Após remover Bruno: " + agenda);

        // containsKey com nome inexistente
        System.out.println("Contém 'Zeca'? " + agenda.containsKey("Zeca"));
        System.out.println("get('Zeca') = " + agenda.get("Zeca")); // null
    }
}
