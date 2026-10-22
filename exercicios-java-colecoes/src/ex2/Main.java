package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(12, 5, 8, 31, 7, 19, 2, 44, 16, 9));

        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        double media = (double) soma / numeros.size();

        System.out.println("Lista: " + numeros);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + Collections.max(numeros));
        System.out.println("Menor: " + Collections.min(numeros));
    }
}
