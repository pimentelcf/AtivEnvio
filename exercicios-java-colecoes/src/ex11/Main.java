package ex11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().trim();

        Set<Character> vistas = new HashSet<>();
        boolean repetida = false;

        for (char c : palavra.toLowerCase().toCharArray()) {
            // add() retorna false quando o elemento já existe no conjunto
            if (!vistas.add(c)) {
                repetida = true;
                break;
            }
        }

        if (repetida) {
            System.out.println("\"" + palavra + "\" possui letras repetidas.");
        } else {
            System.out.println("\"" + palavra + "\" NÃO possui letras repetidas.");
        }
        sc.close();
    }
}
