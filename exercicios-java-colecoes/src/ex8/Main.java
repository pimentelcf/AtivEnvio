package ex8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Ravi", "Vijay", "Ravi", "Ajay", "Vijay");

        Set<String> hashSet = new HashSet<>(lista);
        System.out.println("HashSet (sem ordem garantida): " + hashSet);

        // LinkedHashSet mantém a ordem de inserção
        Set<String> linkedHashSet = new LinkedHashSet<>(lista);
        System.out.println("LinkedHashSet (ordem original): " + linkedHashSet);
    }
}
