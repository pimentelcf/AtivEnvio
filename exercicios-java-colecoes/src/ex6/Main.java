package ex6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static final int N = 100_000;

    static long medir(List<Integer> lista) {
        long inicio = System.nanoTime();
        for (int i = 0; i < N; i++) {
            lista.add(0, i);
        }
        return System.nanoTime() - inicio;
    }

    public static void main(String[] args) {
        long tempoArray = medir(new ArrayList<>());
        long tempoLinked = medir(new LinkedList<>());

        System.out.printf("ArrayList:  %.2f ms%n", tempoArray / 1_000_000.0);
        System.out.printf("LinkedList: %.2f ms%n", tempoLinked / 1_000_000.0);


    }
}
