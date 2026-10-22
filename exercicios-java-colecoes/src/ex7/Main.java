package ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", 9.5));
        alunos.add(new Aluno("Bruno", 6.0));
        alunos.add(new Aluno("Carla", 7.0));
        alunos.add(new Aluno("Diego", 4.5));
        alunos.add(new Aluno("Elisa", 8.2));
        alunos.add(new Aluno("Felipe", 6.9));

        // ordena por nota decrescente
        alunos.sort(Comparator.comparingDouble(Aluno::getNota).reversed());

        System.out.println("== Aprovados (nota >= 7) ==");
        for (Aluno a : alunos) {
            if (a.getNota() >= 7) {
                System.out.println(a);
            }
        }

        System.out.println("== Reprovados ==");
        for (Aluno a : alunos) {
            if (a.getNota() < 7) {
                System.out.println(a);
            }
        }
    }
}
