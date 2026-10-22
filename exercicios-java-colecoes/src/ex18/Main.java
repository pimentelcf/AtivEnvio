package ex18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        int[] chaves = {100, 3, 47, 16};
        String[] valores = {"cem", "três", "quarenta e sete", "dezesseis"};

        for (int i = 0; i < chaves.length; i++) {
            hashMap.put(chaves[i], valores[i]);
            linkedHashMap.put(chaves[i], valores[i]);
            treeMap.put(chaves[i], valores[i]);
        }

        System.out.println("HashMap:       " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap:       " + treeMap);


    }
}
