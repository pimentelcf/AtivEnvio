package ex9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Uva", "Banana", "Abacaxi"};

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        for (String f : frutas) {
            hashSet.add(f);
            linkedHashSet.add(f);
            treeSet.add(f);
        }

        System.out.println("HashSet:       " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet:       " + treeSet);


}
