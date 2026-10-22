package ex12;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String frase = "O gato viu o rato e o rato viu o Gato";

        Set<String> distintas = new TreeSet<>();
        // \\W+ separa por qualquer sequência de caracteres que não sejam letras/dígitos
        for (String palavra : frase.toLowerCase().split("\\W+")) {
            if (!palavra.isEmpty()) {
                distintas.add(palavra);
            }
        }

        System.out.println("Frase: " + frase);
        System.out.println("Palavras diferentes: " + distintas.size());
        System.out.println("Em ordem alfabética: " + distintas);
    }
}
