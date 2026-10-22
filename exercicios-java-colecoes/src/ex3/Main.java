package ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // a) Iterator.remove()
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> it = lista1.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("Com Iterator.remove(): " + lista1);

        // b) removeIf()
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        lista2.removeIf(n -> n % 2 == 0);
        System.out.println("Com removeIf():        " + lista2);


        List<Integer> lista3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        try {
            for (Integer n : lista3) {
                if (n % 2 == 0) {
                    lista3.remove(n); // modifica a lista fora do iterator
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("for-each + list.remove() -> ConcurrentModificationException");
        }


    }
}
