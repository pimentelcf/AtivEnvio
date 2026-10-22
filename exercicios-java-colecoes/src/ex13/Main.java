package ex13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 1) TreeSet ordenado por idade (Comparable implementado na classe Aluno)
        Set<Aluno> porIdade = new TreeSet<>();
        porIdade.add(new Aluno("Ana", 20));
        porIdade.add(new Aluno("Bruno", 18));
        porIdade.add(new Aluno("Carla", 22));
        boolean adicionou = porIdade.add(new Aluno("Diego", 20)); // mesma idade da Ana

        System.out.println("Por idade: " + porIdade);
        System.out.println("Diego (20 anos) foi adicionado? " + adicionou);

        // 2) TreeSet ordenado por nome (Comparator)
        Set<Aluno> porNome = new TreeSet<>(Comparator.comparing(Aluno::getNome));
        porNome.add(new Aluno("Ana", 20));
        porNome.add(new Aluno("Bruno", 18));
        porNome.add(new Aluno("Carla", 22));
        porNome.add(new Aluno("Diego", 20));

        System.out.println("Por nome:  " + porNome);


    }
}
