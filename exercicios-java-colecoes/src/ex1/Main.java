package ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Diego");
        nomes.add("Elisa");

        System.out.println("== for-each ==");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("== Iterator ==");
        Iterator<String> it = nomes.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
