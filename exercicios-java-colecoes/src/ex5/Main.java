package ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));


        List<Integer> manual = new ArrayList<>(original);
        for (int i = 0, j = manual.size() - 1; i < j; i++, j--) {
            int temp = manual.get(i);
            manual.set(i, manual.get(j));
            manual.set(j, temp);
        }

        // Método pronto
        List<Integer> pronto = new ArrayList<>(original);
        Collections.reverse(pronto);

        System.out.println("Original: " + original);
        System.out.println("Manual:   " + manual);
        System.out.println("Pronto:   " + pronto);
        System.out.println("Resultados iguais? " + manual.equals(pronto));
    }
}
