package ex15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String frase = "o gato viu o rato e o rato viu o gato";

        // Versão com getOrDefault()
        Map<String, Integer> freq1 = new HashMap<>();
        for (String palavra : frase.toLowerCase().split("\\s+")) {
            freq1.put(palavra, freq1.getOrDefault(palavra, 0) + 1);
        }
        System.out.println("Com getOrDefault(): " + freq1);

        // Versão com merge()
        Map<String, Integer> freq2 = new HashMap<>();
        for (String palavra : frase.toLowerCase().split("\\s+")) {
            freq2.merge(palavra, 1, Integer::sum);
        }
        System.out.println("Com merge():        " + freq2);

        for (Map.Entry<String, Integer> e : freq2.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
