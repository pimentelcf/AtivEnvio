package ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(Arrays.asList("banana", "kiwi", "abacaxi", "uva", "maçã", "figo"));
        System.out.println("Original: " + palavras);

        // a) ordem alfabética
        List<String> alfabetica = new ArrayList<>(palavras);
        Collections.sort(alfabetica);
        System.out.println("Alfabética: " + alfabetica);

        // b) pelo tamanho do texto
        List<String> porTamanho = new ArrayList<>(palavras);
        porTamanho.sort(Comparator.comparingInt(String::length));
        System.out.println("Por tamanho: " + porTamanho);
    }
}
