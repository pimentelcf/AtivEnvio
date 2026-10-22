package ex10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> b = new HashSet<>(Arrays.asList(4, 5, 6, 7));

        // Cada operação trabalha sobre uma CÓPIA, pois os métodos modificam o Set original
        Set<Integer> uniao = new HashSet<>(a);
        uniao.addAll(b);

        Set<Integer> intersecao = new HashSet<>(a);
        intersecao.retainAll(b);

        Set<Integer> diferenca = new HashSet<>(a);
        diferenca.removeAll(b);

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("União (A ∪ B):       " + uniao);
        System.out.println("Interseção (A ∩ B):  " + intersecao);
        System.out.println("Diferença (A - B):   " + diferenca);
    }
}
