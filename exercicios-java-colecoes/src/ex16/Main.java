package ex16;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String palavra = "programacao";

        Map<Character, Integer> freq = new TreeMap<>();
        for (char c : palavra.toLowerCase().toCharArray()) {
            freq.merge(c, 1, Integer::sum);
        }

        System.out.println("Palavra: " + palavra);
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
