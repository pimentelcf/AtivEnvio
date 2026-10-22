package ex19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<String> pares = Arrays.asList("Ravi-A", "Vijay-B", "Ajay-A", "Amit-B", "Garima-A");

        Map<String, List<String>> turmas = new TreeMap<>();
        for (String par : pares) {
            String[] partes = par.split("-");
            String aluno = partes[0];
            String turma = partes[1];
            // cria a lista da turma se ainda não existir e adiciona o aluno
            turmas.computeIfAbsent(turma, k -> new ArrayList<>()).add(aluno);
        }

        for (Map.Entry<String, List<String>> e : turmas.entrySet()) {
            System.out.println("Turma " + e.getKey() + ": " + e.getValue());
        }
    }
}
